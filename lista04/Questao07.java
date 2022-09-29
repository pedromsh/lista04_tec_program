package lista04;

public class Questao07 {

	public static void main(String[] args) {
		String palavra = "cachorro"; 
		exibir(inverter(separar(palavra)));

	}
	
	public static String[] separar(String palavra) {
		String[] caractere = palavra.split("");
		
		return caractere;
	}
	
	public static String[] inverter(String[] caractere) {
	    String[] invertido = new String[caractere.length];
	    
		for (int i = 0, j = caractere.length - 1; i < caractere.length; i++, j--) {
			invertido[i] = caractere[j];
		}
		
		return invertido;
	}
	
	public static void exibir(String[] invertido) {
		for (int i = 0; i < invertido.length; i++) {
			System.out.print(invertido[i]);
		}
	}

}
