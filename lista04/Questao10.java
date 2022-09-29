package lista04;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int number = input.nextInt();
		
		if(checarArmstrong(number) == true) {
			System.out.print("É número de Armstrong");
		}
		else {
			System.out.print("Não é número de Armstrong");
		}
		
		input.close();

	}
	
	public static boolean checarArmstrong(int number) {
		int aux = number;
		int cont = 0;
		
		while(aux != 0) {
			aux = aux / 10;
			cont ++;
		}
		
		double soma = 0;
		int resto = 0;
		aux = number;
		
		while(aux != 0) {
			resto = aux % 10;
			soma = soma + Math.pow(resto, cont);
			aux = aux / 10;
		}
		
		if(soma == number) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void numberArmstrong(int number) {
		
	}

}
