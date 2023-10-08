package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("#.##");
		Scanner sc = new Scanner(System.in);
		int i, anoAtual, salario;
		double novoSalario, percentual;
		
		System.out.println("Current Year: ");
		anoAtual = sc.nextInt();
		
		salario = 1000;
		percentual = 1.5/100;
		novoSalario = salario + percentual * salario;
		
		for (i = 2007; i < anoAtual; i++) {
			percentual = percentual * 2;
			novoSalario += novoSalario * percentual;
		}
		System.out.println("O novo salario resultou em " + df.format(novoSalario) + "reais");

	}

}
