package lista04;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe o dia da semana que as ferramentas estão sendo alugadas: ");
	String dias = input.next();
	
	System.out.print("Informe o tipo de ferramenta que está sendo alugada: ");
	String tipoFerramenta = input.next();
	
	System.out.print("Informe a quantidade de ferramentas que estão sendo alugadas: ");
	int quantidade = input.nextInt();
	
	double precoNormal = 25.5;
	
	System.out.print("Total a pagar pelo aluguel das ferramentas: " + calcularPreco(dias, tipoFerramenta, precoNormal, quantidade));
	
	input.close();
	}
	
	public static double calcularPreco(String dias, String tipoFerramenta, double precoNormal, int quantidade) {
		double novoPreco = 0;
		double total = 0;
		
		if(dias.equals("segunda")) {
			if(tipoFerramenta.equals("normal")) {
				novoPreco = precoNormal * 0.6;
				total = novoPreco * quantidade;
			}
			else {
				novoPreco = precoNormal * 0.69;
				total = novoPreco * quantidade;
			}
		}
		else if(dias.equals("terça")) {
			if(tipoFerramenta.equals("normal")) {
				novoPreco = precoNormal * 0.6;
				total = novoPreco * quantidade;
			}
			else {
				novoPreco = precoNormal * 0.69;
				total = novoPreco * quantidade;
			}
		}
		else if(dias.equals("quinta")) {
			if(tipoFerramenta.equals("normal")) {
				novoPreco = precoNormal * 0.6;
				total = novoPreco * quantidade;
			}
			else {
				novoPreco = precoNormal * 0.69;
				total = novoPreco * quantidade;
			}
		}
		else{
			if(tipoFerramenta.equals("normal")) {
				total = precoNormal * quantidade;
			}
			else {
				novoPreco = precoNormal * 1.15;
				total = novoPreco * quantidade;
			}
		}
		return total;
	}

}
