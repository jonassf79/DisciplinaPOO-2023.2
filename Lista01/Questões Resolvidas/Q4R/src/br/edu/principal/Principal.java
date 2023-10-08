package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sal, salTotal, aumento;
		System.out.print("Digite o salário do funcionário: ");
		sal = input.nextDouble();
		aumento = sal * (0.25);
		salTotal = sal + aumento;
		System.out.println("O salário do funcionário somado ao aumento resulta em: " + salTotal + " reais");
	}
}
