package lista04;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor do salário mínimo: ");
		double salarioMinimo = input.nextFloat();
		
		System.out.print("Informe a quantidade de dependentes: ");
		int dependentes = input.nextInt();
		
		System.out.print("Informe o valor do salário do funcionário: ");
		double salarioFuncionario = input.nextFloat();
		
		System.out.print("Informe o valor da taxa de imposto já paga: ");
		double impostoPago = input.nextFloat();
		
		calcularImpostoBruto(salarioMinimo, salarioFuncionario);
		
		restituir(dependentes, salarioFuncionario); 
		
		System.out.print("Seu imposto de renda é: " + calcularImpostoRenda(salarioMinimo, salarioFuncionario, impostoPago, dependentes));
		
		input.close();

	}
	
	public static double calcularImpostoBruto(double salarioMinimo, double salarioFuncionario) {
		double impostoBruto = 0;
		
		if(salarioFuncionario > 12 * salarioMinimo) {
			impostoBruto = salarioFuncionario * 0.2;
		}
		else if(salarioFuncionario > 5 * salarioMinimo && salarioFuncionario <= 12 * salarioMinimo) {
			impostoBruto = salarioFuncionario * 0.08;
		}
		
		return impostoBruto;
	}
	
	public static double restituir(int dependentes, double salarioFuncionario) {
		double restituicao = 0;
		
		restituicao = restituicao + (salarioFuncionario * 0.02);
		
		return restituicao;
	}
	
	public static double calcularTaxaGoverno(double salarioMinimo, double salarioFuncionario) {
		double result = 0;
		
		result = calcularImpostoBruto(salarioMinimo, salarioFuncionario) * 0.04;
		
		return result;
	}
	
	public static double calcularImpostoRenda(double salarioMinimo, double salarioFuncionario, double impostoPago, int dependentes) {
		double impostoRenda = 0;
		
		impostoRenda = calcularImpostoBruto(salarioMinimo, salarioFuncionario) + calcularTaxaGoverno(salarioMinimo, salarioFuncionario) - impostoPago - restituir(dependentes, salarioFuncionario);
		
		return impostoRenda;
	}

}
