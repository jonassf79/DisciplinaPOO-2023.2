package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double precoCar, impostos = 0, distrib = 0, precoTotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do carro: ");
		precoCar = sc.nextDouble();
		if (precoCar <= 12.000) {
			impostos = 0;
			distrib = precoCar +(precoCar * 0.05);
		}
		else if (precoCar > 12.000 & precoCar <= 25.000) {
			impostos = precoCar +(precoCar * 0.10);
			distrib = precoCar +(precoCar * 0.15);
		}
		else if (precoCar > 25.000) {
			impostos = precoCar +(precoCar * 0.15);
			distrib = precoCar +(precoCar * 0.20);
		}
		precoTotal = precoCar + impostos + distrib;
		System.out.println("O valor total do carro resulta em: " + precoTotal + " reais");
	}
}
