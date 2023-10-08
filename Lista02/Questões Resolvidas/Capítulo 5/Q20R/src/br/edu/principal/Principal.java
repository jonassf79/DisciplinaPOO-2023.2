package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod, numH, contM = 0, contF = 0;
        double salB, salL = 0, mediaM = 0, mediaF = 0;
        String sexo;

        System.out.print("Digite o código do professor (ou 99999 para sair): ");
        cod = scanner.nextInt();

        while (cod != 99999) {
            System.out.print("Digite o sexo do professor (M/F): ");
            sexo = scanner.next();
            System.out.print("Digite o número de horas trabalhadas: ");
            numH = scanner.nextInt();

            salB = numH * 30;

            if (sexo.equals("M")) {
                salL = salB - (salB * 10 / 100);
                mediaM += salL;
                contM++;
            } else if (sexo.equals("F")) {
                salL = salB - (salB * 5 / 100);
                mediaF += salL;
                contF++;
            }

            System.out.println("Código do professor: " + cod);
            System.out.println("Salário bruto: " + salB);
            System.out.println("Salário líquido: " + salL);

            System.out.print("Digite o código do professor (ou 99999 para sair): ");
            cod = scanner.nextInt();
        }

        if (contM == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            mediaM /= contM;
            System.out.println("Média de salário dos professores do sexo masculino: " + mediaM);
        }

        if (contF == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            mediaF /= contF;
            System.out.println("Média de salário dos professores do sexo feminino: " + mediaF);
        }
	}
}
