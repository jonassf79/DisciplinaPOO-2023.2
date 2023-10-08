package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numUm, numDois;
		System.out.print("Digite o número de início: ");
		numUm = sc.nextInt();
		System.out.print("Digite o número que finaliza a contagem: ");
		numDois = sc.nextInt();
		somarDivisiveis(numUm, numDois);
		
	}
	public static double somarDivisiveis(double b, double c) {
		Scanner sc = new Scanner(System.in);
		double a, soma = 0;
		System.out.print("Digite um número maior que 1: ");
		a = sc.nextInt();
		while(true) {
			if(a > 1) {
				break;
			}
			else {
				System.out.println("OBS: o número deve ser maior que um. ");
				System.out.print("Digite um número maior que 1: ");
				a = sc.nextInt();
			}
		}
		for(double i = b; i <= c; i++) {
			if (i%a == 0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos números divisíveis por "+ a + " entre " + b + " e "+ c + " resulta em: " + soma);
		return soma;
	
	}
}
