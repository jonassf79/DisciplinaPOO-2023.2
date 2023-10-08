package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int cont;
        int codigo, nht;
        double valor;
        double sal_min, sal_inicial, aux, sal_final;
        String turno, categoria;

        sal_min = 450;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Informe o código, nht, turno e categoria do funcionário:");
            codigo = scanner.nextInt();
            nht = scanner.nextInt();
            turno = scanner.next();
            categoria = scanner.next();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.println("Turno inválido. Informe novamente o turno (M/V/N):");
                turno = scanner.next();
            }

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.println("Categoria inválida. Informe novamente a categoria (G/O):");
                categoria = scanner.next();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 18.0 / 100;
                } else {
                    valor = sal_min * 15.0 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 13.0 / 100;
                } else {
                    valor = sal_min * 10.0 / 100;
                }
            }

            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 20.0 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15.0 / 100;
            } else {
                aux = sal_inicial * 5.0 / 100;
            }

            sal_final = sal_inicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("NHT: " + nht + " horas");
            System.out.println("Valor: " + valor + " reais");
            System.out.println("Salário Inicial: " + sal_inicial + " reais");
            System.out.println("Auxílio: " + aux);
            System.out.println("Salário Final: " + sal_final + " reais");
        }

	}

}
