package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int acoesLucroMil = 0;
		int acoesMenosDuzentos = 0;
		double lucroTotal = 0.0;
		

		System.out.print("Quantas ações deseja calcular: ");
		int quantidadeAcoes = scanner.nextInt();

		for (int i = 1; i <= quantidadeAcoes; i++) {
			System.out.print("Digite o tipo da ação (uma letra): ");
			char tipoAcao = scanner.next().charAt(0);
			System.out.print("Digite o preço de compra (reais) da ação: ");
			double precoCompra = scanner.nextDouble();
			System.out.print("Digite o preço de venda (reais) da ação: ");
			double precoVenda = scanner.nextDouble();

			double lucroAcao = precoVenda - precoCompra;
			lucroTotal += lucroAcao;
			
			if (lucroAcao > 1000) {
				acoesLucroMil++;
			} 
			else if (lucroAcao < 200) {
				acoesMenosDuzentos++;
			}

			System.out.println("Lucro da ação " + i + ": R$ " + lucroAcao + "\n");
		}

		System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesLucroMil);
		System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesMenosDuzentos);
		System.out.println("Lucro total da empresa: R$ " + lucroTotal);

	}

}

