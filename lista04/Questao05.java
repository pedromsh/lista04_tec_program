package lista04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digitre o tamanho dos vetores: ");
		int tamanho = input.nextInt();
		
		int[] arrayA = new int[tamanho];
		int[] arrayB = new int[tamanho];
		int[] arrayC = new int[tamanho];
		
		System.out.print("A soma dos elemento do vetor 1 é: " + somarElementos(gerarVetor(arrayA)));
		System.out.println();
		
		System.out.print("A soma dos elemento do vetor 2 é: " + somarElementos(gerarVetor(arrayB)));
		System.out.println();
		
		System.out.print("A soma dos elemento do vetor 3 é: " + somarElementos(gerarVetor(arrayC)));
		System.out.println();
		
		System.out.print("O produto dos elemento do vetor 1 é: " + multiplicarElementos(arrayA));
		System.out.println();
		
		System.out.print("O produto dos elemento do vetor 2 é: " + multiplicarElementos(arrayB));
		System.out.println();
		
		System.out.print("O produto dos elemento do vetor 3 é: " + multiplicarElementos(arrayC));
		System.out.println();
		
		System.out.print("A média dos elemento do vetor 1 é: " + calcularMediaElementos(arrayA, tamanho));
		System.out.println();
		
		System.out.print("A média dos elemento do vetor 2 é: " + calcularMediaElementos(arrayB, tamanho));
		System.out.println();
		
		System.out.print("A média dos elemento do vetor 3 é: " + calcularMediaElementos(arrayC, tamanho));
		System.out.println();
		
		System.out.print("Vetor com as somas: " + Arrays.toString(somaVetores(arrayA, arrayB, arrayC)));
		System.out.println();
		
		System.out.print("Vetor com os produtos: " + Arrays.toString(produtoVetores(arrayA, arrayB, arrayC)));
		System.out.println();
		
		System.out.print("Vetor com as médias: " + Arrays.toString(mediaVetores(arrayA, arrayB, arrayC, tamanho)));
		System.out.println();
		
		System.out.print("Soma do vetor com todas as somas: " + somarTodosVetores(arrayA, arrayB, arrayC));
		System.out.println();
		
		System.out.print("Produto do vetor com todos os produtos: " + multiplicarTodosVetores(arrayA, arrayB, arrayC));
		System.out.println();
		
		System.out.print("Média do vetor com todas as médias: " + CalcularMediaTodosVetores(arrayA, arrayB, arrayC, tamanho));
		System.out.println();
		
		System.out.print("Vetor 1: ");
		System.out.println(Arrays.toString(arrayA));
		System.out.print("Vetor 2: ");
		System.out.println(Arrays.toString(arrayB));
		System.out.print("Vetor 3: ");
		System.out.println(Arrays.toString(arrayC));
		
		input.close();

	}
	
	public static int[] gerarVetor(int[] array) {
		Random gerador = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(100);
		}
		
		return array;
	}
	
	public static int somarElementos(int[] array) {
		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			soma = soma + array[i];
		}
		
		return soma;
	}
	
	public static int multiplicarElementos(int[] array) {
		int produto = 1;
		
		for (int i = 0; i < array.length; i++) {
			produto = produto * array[i];
		}
		
		return produto;
	}
	
	public static double calcularMediaElementos(int[] array, int tamanho) {
		double media = 0;
		
		media = somarElementos(array) / tamanho;
		
		return media;
	}
	
	public static int[] somaVetores(int[] arrayA, int[] arrayB, int[] arrayC) {
		int[] arraySoma = new int[3];
		int cont = 0;
		
		for (int i = 0; i < arraySoma.length; i++) {
			if(cont == 0) {
				arraySoma[i] = somarElementos(arrayA);
			}
			if(cont == 1) {
				arraySoma[i] = somarElementos(arrayB);
			}
			if(cont == 2) {
				arraySoma[i] = somarElementos(arrayC);
			}
			cont++;
		}
		
		return arraySoma;
	}
	
	public static int[] produtoVetores(int[] arrayA, int[] arrayB, int[] arrayC) {
		int[] arrayProduto = new int[3];
		int cont = 0;
		
		for (int i = 0; i < arrayProduto.length; i++) {
			if(cont == 0) {
				arrayProduto[i] = multiplicarElementos(arrayA);
			}
			if(cont == 1) {
				arrayProduto[i] = multiplicarElementos(arrayB);
			}
			if(cont == 2) {
				arrayProduto[i] = multiplicarElementos(arrayC);
			}
			cont++;
		}
		
		return arrayProduto;
	}
	
	public static int[] mediaVetores(int[] arrayA, int[] arrayB, int[] arrayC, int tamanho) {
		int[] arrayMedia = new int[3];
		int cont = 0;
		
		for (int i = 0; i < arrayMedia.length; i++) {
			if(cont == 0) {
				arrayMedia[i] = somarElementos(arrayA) / tamanho;
			}
			if(cont == 1) {
				arrayMedia[i] = somarElementos(arrayB) / tamanho;
			}
			if(cont == 2) {
				arrayMedia[i] = somarElementos(arrayC) / tamanho;
			}
			cont++;
		}
		
		return arrayMedia;
	}
	
	public static int somarTodosVetores(int[] arrayA, int[] arrayB, int[] arrayC) {
		int soma = 0;
		
		for (int i = 0; i < somaVetores(arrayA, arrayB, arrayC).length; i++) {
			soma = soma + somaVetores(arrayA, arrayB, arrayC)[i];
		}
		
		return soma;
	}
	
	public static double multiplicarTodosVetores(int[] arrayA, int[] arrayB, int[] arrayC) {
		double produto = 1;
		
		for (int i = 0; i < produtoVetores(arrayA, arrayB, arrayC).length; i++) {
			produto = produto * produtoVetores(arrayA, arrayB, arrayC)[i];
		}
		
		return produto;
	}
	
	public static double CalcularMediaTodosVetores(int[] arrayA, int[] arrayB, int[] arrayC, int tamanho) {
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < mediaVetores(arrayA, arrayB, arrayC, tamanho).length; i++) {
			soma = soma + mediaVetores(arrayA, arrayB, arrayC, tamanho)[i];
		}
		
		media = soma / 3;
		
		return media;
	}

}
