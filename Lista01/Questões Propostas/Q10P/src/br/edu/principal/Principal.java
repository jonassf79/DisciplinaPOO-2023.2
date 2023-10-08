package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, lado;
		
		System.out.print("Digite a medida do lado do quadrado: ");
		lado = sc.nextDouble();
		area = Math.pow(lado, lado);
		System.out.println("A área do quadrado resulta em: " + area);
	}
	
}
