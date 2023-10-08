package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numb;
		System.out.print("Digite um número: ");
		numb = input.nextDouble();
		System.out.println("O número escolhido ao quadrado resulta em: " + Math.pow(numb, 2));
		System.out.println("O número escolhido ao cubo resulta em: " + Math.pow(numb, 3));
		System.out.println("A raíz quadrada do número escolhido resulta em: " + Math.sqrt(numb));
		System.out.println("A raíz cúbica do número escolhido resulta em: " + Math.cbrt(numb));
		}

}
