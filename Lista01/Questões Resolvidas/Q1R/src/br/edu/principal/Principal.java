package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int n1, n2, n3, n4, soma;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = input.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		System.out.print("Digite o quarto número: ");
		n4 = input.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		System.out.println("A soma dos números resulta em: " + soma);
	}
}
