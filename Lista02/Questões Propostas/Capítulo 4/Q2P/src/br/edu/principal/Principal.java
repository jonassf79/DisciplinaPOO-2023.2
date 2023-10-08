package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] agrs) {
		
		double notaUm, notaDois, mediaArit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		notaUm = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		notaDois = sc.nextDouble();
		
		mediaArit = (notaUm + notaDois)/2;
		System.out.println("A média aritmética das notas resulta em: " + mediaArit);
		if(mediaArit >= 7 & mediaArit <= 10) {
			System.out.println("Situação: Aprovado");
		}
		else if(mediaArit >= 3 & mediaArit < 7) {
			System.out.println("Situação: Exame Final");
		}
		else if(mediaArit >= 0 & mediaArit < 3) {
			System.out.println("Situação: Reprovado");
		}
		else {
			System.out.println("Erro na digitação das notas");
		}
	}
}
