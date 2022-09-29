package lista04;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a massa do material em gramas: ");
		double massa = input.nextDouble();
		
		System.out.print("Massa inicial: " + massa + " gramas");
		System.out.println();
		System.out.print("Massa final: " + calcularMassaFinal(massa) + " gramas");
		System.out.println();
		calcularTempo(massa);
		
		input.close();

	}
	
	public static double calcularMassaFinal(double massa) {
		double massaFinal = massa;
		
		while(massaFinal > 0.5) {
			massaFinal = massaFinal / 2;
		}
		
		return massaFinal;
	}
	
	public static void calcularTempo(double massa) {
		double massaFinal = massa;
		int cont = 0;
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		while(massaFinal > 0.5) {
			massaFinal = massaFinal / 2;
			cont++;
		}
		
		segundos = cont * 50;
		
		if(segundos > 60) {
			minutos = segundos / 60;
			segundos = segundos % 60;
		}
		
		if(minutos > 60) {
			horas = minutos / 60;
			minutos = minutos % 60;
		}
		
		System.out.print("Tempo: " + horas + ":" + minutos + ":" + segundos);	
	}

}
