package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o peso em quilos: ");
	        double pesoEmQuilos = scanner.nextDouble();

	        double pesoEmGramas = pesoEmQuilos * 1000;

	        System.out.println("O peso em gramas é: " + pesoEmGramas + " gramas");

	    }
}
