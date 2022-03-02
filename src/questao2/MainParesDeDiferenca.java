package questao2;

import java.util.Scanner;

public class MainParesDeDiferenca {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //inicializando a classe scanner para ler dados do teclado;
		
		int n = 0;
		System.out.println("Digite qual o tamanho seu vetor terá:");  //aqui eu digito qual tamanho do meu vetor
		n = leitor.nextInt();
		int[] vetor = new int[n];
		
		
		System.out.println("Agora preencha o seu vetor:");  //aqui eu preencho o meu vetor com quais numeros eu quiser
		 for (int i=0; i<n; i++) {
			 System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
			 vetor[i] = leitor.nextInt();
		 }
		  
		 
		 int x = 0;
		 System.out.println("Digite qual inteiro qualquer você testará no programa:");
		 x = leitor.nextInt();   //aqui eu digito qual será o inteiro qualquer x a ser verificado pelo programa;

		 ParesDeDiferenca testar = new ParesDeDiferenca(vetor, x); //inicializo a classe encarregada da resolução
		 testar.setVetor(vetor);								// Passo o meu vetor e o meu inteiro x como parâmetros para a verificação
		 testar.setparesExistentes();							//metodo setVetor ordena o meu vetor digitado
		 testar.getParesExistentes();							//metodo setParesExistentes faz a resolução do problema
	}															//metodo getParesExistentes mostra o resultado final do problema

}

