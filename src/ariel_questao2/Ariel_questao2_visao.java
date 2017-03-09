package ariel_questao2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ariel_questao2_visao {

	public int[][] recGraf() {
		int[][] matriz = new int[5][5];
		int holder;
		for (int indexI = 0; indexI < 5; indexI++) {
			for (int indexJ = 0; indexJ < 5; indexJ++) {
				do {
					holder = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Que número vai em {" + indexI + "," + indexJ + "} ?", "Grafo", JOptionPane.PLAIN_MESSAGE));
					matriz[indexI][indexJ] = holder;
				} while ((matriz[indexI][indexJ] != 1 && (matriz[indexI][indexJ]) != 0));
			}
		}
		return matriz;

	}

	public int[] recDirec() {
		int[] vetor = new int[5];
		for (int i = 0; i < 4; i++) {
			do {
				if (i == 0) {
					vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Onde começa?(0 a 4)", "Caminho",
							JOptionPane.PLAIN_MESSAGE));
				}
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Para onde vai agora?",
						"Seguindo o caminho", JOptionPane.PLAIN_MESSAGE));

			} while (vetor[i] != 0 && vetor[i] != 1 && vetor[i] != 2 && vetor[i] != 3 && vetor[i] != 4);
		}
		return vetor;
	}

	public void showFound(boolean found) {
		int whynot = found ? 1 : 0;
		if (whynot == 1) {
			JOptionPane.showMessageDialog(null, "Achou o caminho");

		} else if (whynot == 0) {
			JOptionPane.showMessageDialog(null, "Não achou o caminho");

		}
	}

	public void showArr2(int[][] xyz) {
		int i, collum = xyz[0].length;
		String full = "\n", part;
		for (i = 0; i < collum; i++) {
			part = Arrays.toString(xyz[i]);
			full = full + "\n" + part;
		}
		JOptionPane.showMessageDialog(null, full);

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
