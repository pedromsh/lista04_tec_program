package lista04;

import java.util.Arrays;
import java.util.Random;

public class Questao03 {

	public static void main(String[] args) {
        int[] array = new int[100];
		
		calcularCondicao(gerarVetor(array));

	}
	
	public static int[] gerarVetor(int[] array) {
		Random gerador = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt();
		}
		
		return array;
	}
	
	public static void calcularCondicao(int[] array) {
		int[] arrayPositiveMultiple3 = new int[array.length];
		int[] arrayPositiveNoMultiple3 = new int[array.length];
		int[] arrayNegativeMultiple3 = new int[array.length];
		int[] arrayNegativeNoMultiple3 = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= 0) {
				if(array[i] % 3 == 0) {
					arrayPositiveMultiple3[i] = array[i];
				}
				else {
					arrayPositiveNoMultiple3[i] = array[i];
				}
		    }
			
			if(array[i] < 0) {
				if(array[i] % 3 == 0) {
					arrayNegativeMultiple3[i] = array[i];
				}
				else {
					arrayNegativeNoMultiple3[i] = array[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(arrayPositiveMultiple3));
		System.out.println(Arrays.toString(arrayPositiveNoMultiple3));
		System.out.println(Arrays.toString(arrayNegativeMultiple3));
		System.out.println(Arrays.toString(arrayNegativeNoMultiple3));
	}

}
