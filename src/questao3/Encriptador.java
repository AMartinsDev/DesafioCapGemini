package questao3;


public class Encriptador {
	
	private String textoInicial;
	private String textoFinal = new String();
	private char[][] textoAuxiliar;
	private char[] stringConvertidaParaChar;
	
	
	
	public Encriptador(String textoInicial) {
		this.textoInicial = textoInicial;       	                   //construtor da classe, s� utilizo a string recebida do programa principal, as demais vari�veis s�o 
	}												                   //trabalhadas dentro dessa classe;

	
	
	public String getTextoInicial() {
	        
		this.textoInicial = this.textoInicial.replace(" ", ""); 	   //recebo a string inicial e elimino os espa�os usando metodo replace

		return textoInicial;
	}

	
	
	public void resolucao() {   	                                   //metodo que ir� fazer a codifica��o da string
		
		int a = 0;
		double b = 0;
		int comprimentoDaString = 0;
				
		a = getTextoInicial().length();    
		comprimentoDaString = getTextoInicial().length();   	       //capturo o tamanho da string sem os "espa�os" com o uso do length
		b = a;
		b = Math.sqrt(b);  		                                       //fa�o a raiz quadrada do comprimento, a variavel b � um double, pois a classe math retorna esse tipo
		b = Math.round(b); 		                                       //aproximo o valor da raiz quadrada para mais ou para menos, utilizando o metodo round;
		a = (int) b;  		                                           //passo o valor da raiz quadrada para uma vari�vel do tipo int, para que eu possa trabalhar no meu c�digo
		
		
		textoAuxiliar = new char[a][a];                                //inicializo uma matriz de Char, ela ser� a minha auxiliar para gerar o Texto Final

        stringConvertidaParaChar = textoInicial.toCharArray(); 		   //converto o texto inicial sem os espa�os para uma cadeia de caracteres

        int aux = 0;
        
        for (int i = 0; i < a; i++) {
        	
            for (int j = 0; j < a; j++) {
               
                textoAuxiliar[i][j] = stringConvertidaParaChar[aux];   //percorro a matriz e vou atribuindo cada linha dela com a quantidade de caracteres
                aux++;												   // da raiz do comprimento da string principal;
                
                if (aux == comprimentoDaString) {  					   //quando termino de adicionar todos os caracteres nos seus respectivos intervalos, pauso o loop
                    break;
                }   
            }
        }

        
        for (int i = 0; i < a; i++) {
        	
            for (int j = 0; j < a; j++) {
            	
                textoFinal = textoFinal + textoAuxiliar[j][i];         //somo as posi��es da matriz e vou gerando a string final
            }							
            													       //exemplo: posicao [0][0] + posicao [0][1] == t + a
            textoFinal = textoFinal + " ";     					       //a cada itera��o do segundo for, adiciono um "espa�o" conforme solicitado em quest�o
        }
        
        System.out.println(textoFinal);                                //resultado final do encriptamento
    }
	
	
}
