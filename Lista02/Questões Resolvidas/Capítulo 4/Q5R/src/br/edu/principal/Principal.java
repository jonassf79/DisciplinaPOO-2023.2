package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numUm, numDois, numTres, numQuat;
		
		System.out.println("Escreva três números em ordem crescente: ");
		System.out.print("número 1 >");
		numUm = sc.nextInt();
		System.out.print("número 2 >");
		numDois = sc.nextInt();
		System.out.print("número 3 >");
		numTres = sc.nextInt();
		
		while (numUm > numDois || numDois > numTres) {
			System.out.println("Os números não estão em ordem crescente.\nDigite novamente: ");
			System.out.print("número 1 >");
			numUm = sc.nextInt();
			System.out.print("número 2 >");
			numDois = sc.nextInt();
			System.out.print("número 3 >");
			numTres = sc.nextInt();
		}
		System.out.println("\nDigite o quarto número (fora de ordem) : ");
		System.out.print("número 4 >");
		numQuat = sc.nextInt();
		
		if(numQuat > numTres) {
			System.out.println("A ordem decrescente dos números é: " + numQuat + " - " + numTres + " - " + numDois + " - " + numUm );
		}
		else if (numQuat < numTres && numQuat > numDois) {
			System.out.println("A ordem decrescente dos números é: " + numTres + " - " + numQuat + " - " + numDois + " - " + numUm );	
		}
		else if(numQuat < numDois && numQuat > numUm ) {
			System.out.println("A ordem decrescente dos números é: " + numTres + " - " + numDois + " - " + numQuat + " - " + numUm );
		}
		else {
			System.out.println("A ordem decrescente dos números é: " + numTres + " - " + numDois + " - " + numUm + " - " + numQuat );
		}
	}

}
