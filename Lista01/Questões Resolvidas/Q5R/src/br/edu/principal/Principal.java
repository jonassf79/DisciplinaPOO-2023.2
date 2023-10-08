package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario, percent, aumento, novoSalario;
		
		System.out.print("Digite o salário do funcionario: ");
		salario = input.nextDouble();
		
		System.out.print("Digite o percentual que o salário receberá de aumento: ");
		
		percent = input.nextDouble();
		aumento = salario * (percent / 100);
		novoSalario = salario + aumento;
		System.out.println("O novo salário do funcionario resultou em: " + novoSalario + " reais");
		
	}
	
}
