package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, chequeUm, chequeDois, cmpfUm, cmpfDois, saldo;
		 
		System.out.print("Digite o valor do salário: ");
		salario = sc.nextDouble();
		
		System.out.print("Digite o valor do primeiro cheque: ");
		chequeUm = sc.nextDouble();
		
		System.out.print("Digite o valor do segundo cheque: ");
		chequeDois = sc.nextDouble();
		
		cmpfUm = chequeUm * (0.038/100);
		cmpfDois = chequeDois * (0.038/100);
		saldo = salario - chequeUm - chequeDois - cmpfUm - cmpfDois;
		System.out.println("O saldo resultou em: " + saldo + " reais");
	}

}
