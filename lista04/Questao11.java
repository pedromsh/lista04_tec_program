package lista04;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];
		
		imprimirMatriz(prencheerMatriz(matriz));
		imprimirMatrizHorario(criarMatrizHorario(matriz));

	}
	
	public static int[][] prencheerMatriz(int[][] matriz) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite o elemento [" + i + "," + j +"]:");
				matriz[i][j] = input.nextInt();
			}
		}
		
		input.close();
		
		return matriz;
	}
	
	public static int[][] criarMatrizHorario(int[][] matriz) {
		int[][] matHorario = new int[2][3];
		
		for(int i = 0, r = 0; i < 2; i++, r++) {
			for(int j = 0, s = 2; j < 3; j++, s--) {
				matHorario[i][j] = matriz[s][r];
			}
		}
		return matHorario;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		System.out.println("Matriz normal:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void imprimirMatrizHorario(int[][] matriz) {
		System.out.println("Matriz no sentido horário:");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
