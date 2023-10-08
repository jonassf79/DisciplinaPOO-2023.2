package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota3 = input.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota2 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("A média das notas resulta em: " + media);
	}

}
