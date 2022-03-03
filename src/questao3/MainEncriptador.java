package questao3;

public class MainEncriptador {

	public static void main(String[] args) {
		
		String texto = "tenha um bom dia";
		Encriptador teste = new Encriptador(texto);
		
		teste.getTextoInicial();
		teste.resolucao();

	}

}
