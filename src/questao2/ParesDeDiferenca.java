package questao2;

public class ParesDeDiferenca {

	private int[] vetor = {};
	private int inteiroQualquer = 0;
	private int paresExistentes;
	
	
	public ParesDeDiferenca(int[] vetor, int inteiroQualquer) { //Construtor da classe onde eu recebo o vetor para verificar
																// e recebo o inteiro qualquer que a questão solicita					
		this.vetor = vetor;
		this.inteiroQualquer = inteiroQualquer;
	}
	
	public void setVetor(int[] vetor) {  //metodo para ordenar o vetor dado na classe main, facilitando a resolução da questão
		
		int j; int i; int t;
		
		for (i = 0; i < vetor.length; i++){
			for (j = i+1; j < vetor.length; j++){
				
				if (vetor[i] > vetor[j]){
					
					t = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = t;
				}
			}
		}
		this.vetor = vetor;
	}
	
	
	public int setparesExistentes() {  //metodo em que se descobre quantos pares de diferenca possui um determinado vetor dado um determinado inteiro x
		
		for(int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] - vetor[i] == this.inteiroQualquer) {   //com o vetor ordenado, eu vou subtraindo o primeiro indice dos demais e vou verificando
					this.paresExistentes++;							//caso a verificação seja igual ao inteiro x que passei como parâmetro na classe main
				}													//a quantidade de pares existentes será incrementada;
			}
		}
		return paresExistentes;
	}

	
	public void getParesExistentes() {  //metodo que recebo o resultado final da pesquisa
		System.out.println("Existem: " + this.paresExistentes + " pares de diferenca no vetor com o inteiro x dado" );
	}
	
	
}
