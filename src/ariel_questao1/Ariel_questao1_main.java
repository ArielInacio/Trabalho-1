package ariel_questao1;

public class Ariel_questao1_main {

	public static void main(String[] args) {
		Ariel_questao1_visao talky = new Ariel_questao1_visao();
		Ariel_questao1_modelo thingy = new Ariel_questao1_modelo();
		int continuar = 0;
		int[][] test = talky.recM();
		// talky.showArr2(test);
		do{
			int[][] padrao = talky.recPat();
			// talky.showArr2(padrao);
			boolean found = (thingy.findPat(test, padrao));
			talky.showFound(found);
			continuar = talky.askMore();
		} while (continuar == 1);
	}

}
