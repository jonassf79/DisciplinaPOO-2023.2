package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		double delValor, aValor, bValor, cValor, raizSum, raizSub, xLinha, xDLinha;
		
		System.out.print("Digite o valor de a:");
		aValor = sc.nextInt();
		System.out.print("Digite o valor de b: ");
		bValor = sc.nextInt();
		System.out.print("Digite o valor de c: ");
		cValor = sc.nextInt();
		
		delValor = Math.pow(bValor, 2) - (4 * aValor * cValor);
		
		if(delValor > 0) {
			xLinha = ((bValor * -1) + Math.sqrt(delValor)) / (2*aValor);
			xDLinha = ((bValor * -1) - Math.sqrt(delValor)) / (2*aValor);
			System.out.println("\nDelta positivo -> existem duas raízes reais.");
			System.out.println("As raízes da função resultam em: ");
			System.out.println("x'= " + xLinha);
			System.out.println("x''= " + xDLinha);
		}
		else if(delValor == 0) {
			xLinha = ((bValor * -1) + Math.sqrt(delValor)) / (2*aValor);
			xDLinha = ((bValor * -1) - Math.sqrt(delValor)) / (2*aValor);
			System.out.println("\nDelta = 0 -> existe uma raíz real.");
			System.out.println("x = " + xLinha);
		}
		else {
			System.out.println("\nNão existem raízes reais");
		}
	}	
}
