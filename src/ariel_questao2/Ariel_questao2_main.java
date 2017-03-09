package ariel_questao2;

public class Ariel_questao2_main {
	public static void main(String[] args) {
		Ariel_questao2_visao talky = new Ariel_questao2_visao();
		Ariel_questao2_modelo engine = new Ariel_questao2_modelo();
		int continuar =0;
		//engine.findPath(talky.recPat(), talky.recDirec())
		int[][] grafo = talky.recGraf();
		//talky.showArr2(grafo);
		do{
			int[] caminho = talky.recDirec();
			boolean found = engine.findPath(grafo, caminho);
			talky.showFound(found);
			continuar = talky.askMore();
		} while (continuar ==1);
	}
	
}
