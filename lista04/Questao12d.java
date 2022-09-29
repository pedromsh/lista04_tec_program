package lista04;

public class Questao12d {

	public static void main(String[] args) {
		desenhar1();
		desenhar2();
		desenhar3();

	}
	
	public static void desenhar1(){
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void desenhar2(){
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}
	
	public static void desenhar3(){
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}

}
