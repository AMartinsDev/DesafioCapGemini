package questao3;


public class Encriptador {
	
	private String textoInicial;
	private String textoFinal = new String();

	public Encriptador(String textoInicial) {
		this.textoInicial = textoInicial;
	}

	
	public String getTextoInicial() {
	        
		this.textoInicial = this.textoInicial.replace(" ", "");

		return textoInicial;
	}

	
	public void resolucao() {
		
		int a = 0;
		double b = 0;
		int c = 0;
				
		a = getTextoInicial().length();
		c = getTextoInicial().length();
		b = a;
		b = Math.sqrt(b);
		b = Math.round(b);
		a = (int) b;
		
		char[][] textoAuxiliar = new char[a][a];

        char[] cadeiaDeChar = textoInicial.toCharArray();

        int aux = 0;
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (aux == c) {
                    break;
                }
                textoAuxiliar[i][j] = cadeiaDeChar[aux];
                aux++;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                textoFinal = textoFinal + textoAuxiliar[j][i];
            }
            textoFinal = textoFinal + " ";
        }
        
        System.out.println(textoFinal);
    }
	
	
}
