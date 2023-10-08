package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double salarioAtual, salarioNovo;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário do funcionário: ");
		salarioAtual = sc.nextDouble();
		
		if(salarioAtual <= 300){
			salarioNovo = salarioAtual + (salarioAtual * 0.15);
		}
		else if(salarioAtual > 300 & salarioAtual <= 600){
			salarioNovo = salarioAtual + (salarioAtual * 0.10);
		}
		else if(salarioAtual > 600 & salarioAtual <= 900){
			salarioNovo = salarioAtual + (salarioAtual * 0.05);
		}
		else {
			salarioNovo = salarioAtual;
		}
		System.out.println("O novo salário do funcionário resulta em: " + salarioNovo + " reais");
	}
}
