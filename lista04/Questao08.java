package lista04;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		char[] charArray = new char[12];
		preencherCharArray(charArray);
		decodificar(charArray);
		imrpimirNumero(charArray);
		

	}
	
	public static char[] preencherCharArray(char[] charArray) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print("Digite o elemento " + i + ":");
			charArray[i] = input.next().charAt(0);
		}
		
		input.close();
		
		return charArray;
	}
	
	public static void decodificar(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '#') {
				charArray[i] = '1';
			}
			else if(charArray[i] == 'a' || charArray[i] == 'b' || charArray[i] == 'c') {
				charArray[i] = '2';
			}
			else if(charArray[i] == 'd' || charArray[i] == 'e' || charArray[i] == 'f') {
				charArray[i] = '3';
			}
			else if(charArray[i] == 'g' || charArray[i] == 'h' || charArray[i] == 'i') {
				charArray[i] = '4';
			}
			else if(charArray[i] == 'j' || charArray[i] == 'k' || charArray[i] == 'l') {
				charArray[i] = '5';
			}
			else if(charArray[i] == 'm' || charArray[i] == 'n' || charArray[i] == 'o') {
				charArray[i] = '6';
			}
			else if(charArray[i] == 'p' || charArray[i] == 'q' || charArray[i] == 'r' || charArray[i] == 's') {
				charArray[i] = '7';
			}
			else if(charArray[i] == 't' || charArray[i] == 'u' || charArray[i] == 'v') {
				charArray[i] = '8';
			}
			else if(charArray[i] == 'w' || charArray[i] == 'x' || charArray[i] == 'y' || charArray[i] == 'z') {
				charArray[i] = '9';
			}
			else if(charArray[i] == '+') {
				charArray[i] = '0';
			}
			
		}
	}
	
	public static void imrpimirNumero(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			if(i == 0) {
				System.out.print("(");
			}
			
			System.out.print(charArray[i]);
			
			if(i == 2) {
				System.out.print(")");
			}
		}
	}

}
