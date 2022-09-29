package lista04;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a altura do triângulo: " );
		int altura = input.nextInt();
		
		desenhar(altura);
		
		input.close();

	}

	public static void desenhar(int altura) {
		for (int i = 0; i < altura; i++) {
			for(int j = altura; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
