package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numUm, numDois;
		
		System.out.print("Digite o primeiro número: ");
		numUm = sc.nextFloat();
		System.out.print("Digite o segundo número: ");
		numDois = sc.nextFloat();
		
		System.out.println(" ");
		if(numUm > numDois) {
			System.out.println("O primeiro número é maior que o segundo.");
		}
		else if(numUm < numDois) {
			System.out.println("O segundo número é maior que o primeiro.");
		}
		else {
			System.out.println("Os números são iguais.");
		}
	}
}
