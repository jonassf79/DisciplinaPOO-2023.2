package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gatoUm, gatoDois, pesoRacao, totalDias;
		
		System.out.print("Digite o peso(kg) do saco da ração: ");
		pesoRacao = sc.nextDouble();
		System.out.print("Digite a porção diária(g) do primeiro gato: ");
		gatoUm = sc.nextDouble();
		System.out.print("Digite a porção diária(g) do segundo gato: ");
		gatoDois = sc.nextDouble();
		
		gatoUm = gatoUm /1000;
		gatoDois = gatoDois / 1000;
		totalDias = pesoRacao - (5 * (gatoUm + gatoDois));
		System.out.println("A ração restante no saco após 5 dias é de: " + totalDias + " kg");
	}

}
