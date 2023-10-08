package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		double raio, area;
		
		System.out.print("Digite o valor do raio do círculo: ");
		raio = input.nextDouble();
		
		area = Math.pow(raio, 2) * Math.PI;
		System.out.println("O valor da área do círculo resulta em: " + area);
		
	}

}
