package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, altura, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a base do triângulo: ");
		base = input.nextDouble();
		System.out.print("Digite a altura do triângulo: ");
		altura = input.nextInt();
		
		area = (base * altura)/ 2;
		System.out.println("A área do trângulo resultou em: "+ area);
	}

}
