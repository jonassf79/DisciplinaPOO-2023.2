package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double salario, imp, salarioFinal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o salário do funcionario: ");
		salario = input.nextDouble();
		imp = salario * 0.10;
		salarioFinal = salario + 50 - imp;
		
		System.out.println("O salário do funcionário resultou em: " + salarioFinal + " reais");
	}

}