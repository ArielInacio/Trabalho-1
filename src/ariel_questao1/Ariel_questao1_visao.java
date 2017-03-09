package ariel_questao1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ariel_questao1_visao {
	public void showArr2(int[][] xyz) {
		int i, collum = xyz[0].length;
		String full = "\n", part;
		for (i = 0; i < collum; i++) {
			part = Arrays.toString(xyz[i]);
			full = full + "\n" + part;
		}
		JOptionPane.showMessageDialog(null, full);

	}

	public int[][] recM() {
		int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de linhas?", "Matriz Imagem",
				JOptionPane.PLAIN_MESSAGE));
		int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de colunas?", "Matriz Imagem",
				JOptionPane.PLAIN_MESSAGE));
		int[][] matriz = new int[i][j];

		for (int indexI = 0; indexI < i; indexI++) {
			for (int indexJ = 0; indexJ < j; indexJ++) {
				do {
					int holder = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Que número vai em {" + indexI + "," + indexJ + "} ?",
									"Matriz Imagem", JOptionPane.PLAIN_MESSAGE));
					matriz[indexI][indexJ] = holder;
				} while ((matriz[indexI][indexJ] != 1 && (matriz[indexI][indexJ]) != 0));
			}
		}
		return matriz;
	}

	public int[][] recPat() {
		int[][] matriz = new int[3][3];
		int holder;
		for (int indexI = 0; indexI < 3; indexI++) {
			for (int indexJ = 0; indexJ < 3; indexJ++) {
				do {
					holder = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Que número vai em {" + indexI + "," + indexJ + ") ?",
									"Matriz Padrão", JOptionPane.PLAIN_MESSAGE));
					matriz[indexI][indexJ] = holder;
				} while ((matriz[indexI][indexJ] != 1 && (matriz[indexI][indexJ]) != 0));
			}
		}
		return matriz;

	}

	public void showFound(boolean found) {
		int whynot = found ? 1 : 0;
		if (whynot == 1) {
			JOptionPane.showMessageDialog(null, "Achou padrão", "Resultado", JOptionPane.PLAIN_MESSAGE);

		} else if (whynot == 0) {
			JOptionPane.showMessageDialog(null, "Não encontou o padrão", "Resultado", JOptionPane.PLAIN_MESSAGE);

		}
	}

	public int askMore() {
		int continuar;
		int yesno = JOptionPane.showConfirmDialog(null, "Deseja continuar a procurar na mesma matriz?", "Mais padrões?",
				JOptionPane.YES_NO_OPTION);
		if (yesno == JOptionPane.YES_OPTION)
			continuar = 1;
		else
			continuar = 0;
		return continuar;
	}
}
