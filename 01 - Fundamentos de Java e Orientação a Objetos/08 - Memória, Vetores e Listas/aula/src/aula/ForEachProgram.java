package aula;

public class ForEachProgram {
	
	public static void main(String[] args) {
		
		// INICIALIZANDO UM VETOR JÁ INSERINDO DADOS. 
		// OBS: NÃO HÁ NECESSIDADE DE INFORMAR O TAMANHO, POIS OS DADOS ESTÃO SENDO INFORMARMOS NA DECLARAÇÃO DA VARIÁVEL.
		String[] names = new String[] {"João Felipe", "Márcia", "Felipe"};
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
