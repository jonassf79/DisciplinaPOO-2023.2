package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1, n2, n3, media;
		int p1, p2, p3;
		
		System.out.print("Digite a primeira nota: ");
		n1 = input.nextDouble();
		System.out.print("Digite o peso da primeira nota: ");
		p1 = input.nextInt();
		System.out.println(" ");
		
		System.out.print("Digite a segunda nota: ");
		n2 = input.nextDouble();
		System.out.print("Digite o peso da segunda nota: ");
		p2 = input.nextInt();
		System.out.println(" ");
		
		System.out.print("Digite a terceira nota: ");
		n3 = input.nextDouble();
		System.out.print("Digite o peso da terceira nota: ");
		p3 = input.nextInt();
		System.out.println(" ");
		
		media = ((n1 * p1)+ (n2 * p2)+(n3 * p3))/ (p1 + p2 + p3);
		System.out.println("A média geral resultou em: " + media);

	}

}
