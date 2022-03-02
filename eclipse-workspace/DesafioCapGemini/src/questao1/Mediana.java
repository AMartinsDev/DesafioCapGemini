package questao1;

public class Mediana {

	public void funcMediana(int vet[]){
		
		//ordenando o vetor com o bubble sort;
		int j;
		int i;
		int t;
		
		for (i = 0; i < vet.length; i++){
			for (j = i+1; j < vet.length; j++){
				
				if (vet[i] > vet[j]){
					
					t = vet[i];
					vet[i] = vet[j];
					vet[j] = t;
				}
			}
		}
		
		//Calculo da mediana
		//a mediana é o numero central do vetor após ordenado.
		int mediana = 0;
		int meio = 0;
		meio = vet.length/2;
		mediana = vet[meio];
	
		
		System.out.println(mediana);
	}

	public static void main(String[] args) {
		
		int [] vet = {9, 2, 1, 4, 6};
		
		Mediana iniciar = new Mediana();
		iniciar.funcMediana(vet);

	}

}
