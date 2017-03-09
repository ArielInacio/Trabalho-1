package ariel_questao2;

public class Ariel_questao2_modelo {
	public boolean findPath(int[][] grafo, int[] caminho) {
		boolean found = false;
		int first = caminho[0], second = caminho[1], third = caminho[2], fourth = caminho[3], fifth = caminho[4];
		if (grafo[first][second] == 1) {

			if (grafo[second][third] == 1) {

				if (grafo[third][fourth] == 1) {

					if (grafo[fourth][fifth] == 1) {

						found = true;
					}
				}
			}
		}
		return found;

	}

}
