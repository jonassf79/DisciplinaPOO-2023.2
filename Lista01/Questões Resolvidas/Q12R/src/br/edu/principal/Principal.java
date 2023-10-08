package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numUm, numDois, expUm, expDois;
		System.out.println("Obs: Apenas números positivos.");
		
		System.out.print("Digite o primeiro número: ");
		numUm = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numDois = input.nextInt();
		
		expUm = Math.pow(numUm, numDois);
		expDois = Math.pow(numDois, numUm);
		
		System.out.println("O primeiro número elevado ao segundo resulta em: " + expUm);
		System.out.println("O segundo número elevado ao primeiro resulta em: " + expDois);
		
	}

}
