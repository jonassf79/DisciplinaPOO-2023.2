package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args ) { 
		Scanner sc = new Scanner(System.in);
		double numb;
		
		System.out.println("Par ou Impar?\n================");
		System.out.print("Digite um número: ");
		numb = sc.nextDouble();
		System.out.println(" ");
		
		if(numb%2 == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é ímpar.");
		}
	}

}
