package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral;
        int qtd_cons;

        tot_geral = 0;
        qtd_cons = 0;

        System.out.print("Digite o salário: ");
        sal = scanner.nextDouble();
        System.out.print("Digite a quantidade de consumo de energia: ");
        qtd = scanner.nextDouble();
        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;
            System.out.print("Digite o tipo (1, 2 ou 3): ");
            tipo = scanner.nextDouble();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
                System.out.println("Tipo inválido. Acrescimento de 0%.");
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Gasto: " + gasto);
            System.out.println("Acrescimento: " + acresc);
            System.out.println("Total: " + total);

            System.out.print("Digite a quantidade de consumo de energia (ou 0 para sair): ");
            qtd = scanner.nextDouble();
        }

        System.out.println("Total geral: " + tot_geral);
        System.out.println("Quantidade de consumos com total entre 500 e 1000: " + qtd_cons);

    }
}
