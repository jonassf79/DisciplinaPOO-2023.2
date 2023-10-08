package br.edu.principal;
import java. util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double depos, taxa, rend, total;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do depósito: ");
		depos = input.nextDouble();
		System.out.print("Digite o valor da taxa de juros: ");
		taxa = input.nextDouble();
		System.out.println(" ");
		rend = depos * (taxa/100);
		total = depos + rend;
		System.out.println("O valor do redimento do deposito é de: " + rend + " reais");
		System.out.println("O valor total do deposito acrescido do rendimento é de: " + total + " reais");
		
	}

}
