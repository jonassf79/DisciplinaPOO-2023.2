package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 System.out.println("Digite a largura do cômodo (em metros): ");
		 double largura = scanner.nextDouble();

		 System.out.println("Digite o comprimento do cômodo (em metros): ");
		 double comprimento = scanner.nextDouble();

		 double area = largura * comprimento;

		 double potenciaIluminacao = area * 18;

		 System.out.println("A área do cômodo é de " + area + " metros quadrados.");
		 System.out.println("A potência de iluminação necessária é de " + potenciaIluminacao + " Watts.");


	}

}
