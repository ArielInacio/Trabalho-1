package ariel_questao1;

import java.util.Arrays;

public class Ariel_questao1_modelo {
	public boolean findPat(int[][] matriz, int[][] padrao) {
		// ariel_questao1_visao talky = new ariel_questao1_visao();

		boolean found = false;
		int[][] sample = new int[3][3];
		int linha = matriz.length;
		int coluna = matriz[0].length;
		int i, j, whynot = 0;
		boolean[] test = new boolean[3];
		for (i = 0; i <= (linha - 3) && (whynot == 0); i++) {
			for (j = 0; j <= (coluna - 3) && (whynot == 0); j++) {
				sample[0] = Arrays.copyOfRange(matriz[i], j, j + 3);
				sample[1] = Arrays.copyOfRange(matriz[i + 1], j, j + 3);
				sample[2] = Arrays.copyOfRange(matriz[i + 2], j, j + 3);
				// System.out.println("hi");

				for (int t = 0; t < 3; t++) {
					test[t] = Arrays.equals(padrao[t], sample[t]);
					// System.out.print(test[t]);
				}
				found = test[0] && test[1] && test[2] ? true : false;
				whynot = found ? 1 : 0;
				// System.out.print(found);
			}

		}

		// talky.showArr2(sample);
		return found;
	}

}
