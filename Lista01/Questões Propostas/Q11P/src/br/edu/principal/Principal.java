package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 System.out.println("Digite o valor da diagonal maior: ");
		 double diagonalMaior = scanner.nextDouble();

		 System.out.println("Digite o valor da diagonal menor: ");
		 double diagonalMenor = scanner.nextDouble();

		 double area = (diagonalMaior * diagonalMenor) / 2;

		 System.out.println("A área do losango é: " + area);
	       
	}

}
