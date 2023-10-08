package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a quantidade de dinheiro em reais: ");
	        double dinheiroEmReais = scanner.nextDouble();

	        double cotacaoDolar = 1.80;
	        double cotacaoMarcoAlemao = 2.00;
	        double cotacaoLibraEsterlina = 3.57;

	        double dinheiroEmDolares = dinheiroEmReais / cotacaoDolar;
	        double dinheiroEmMarcoAlemao = dinheiroEmReais / cotacaoMarcoAlemao;
	        double dinheiroEmLibraEsterlina = dinheiroEmReais / cotacaoLibraEsterlina;

	        System.out.println("Quantidade de dinheiro em dólares: " + dinheiroEmDolares);
	        System.out.println("Quantidade de dinheiro em marco alemão: " + dinheiroEmMarcoAlemao);
	        System.out.println("Quantidade de dinheiro em libra esterlina: " + dinheiroEmLibraEsterlina);

	        scanner.close();
	    }
}
