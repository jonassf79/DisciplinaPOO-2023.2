package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtdPar = 0;
        double mediaPar = 0, somaPar = 0, qtdImpar = 0, media = 0, perc = 0;

        System.out.println("Digite números (digite 30000 para encerrar):");
        num = scanner.nextInt();

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            soma += num;
            qtd++;

            if (num % 2 == 0) {
                somaPar += num;
                qtdPar++;
            } else {
                qtdImpar++;
            }

            num = scanner.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado");
        } else {
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

            if (qtdPar == 0) {
                System.out.println("Nenhum número par");
            } else {
                mediaPar = somaPar / qtdPar;
                System.out.println("Média dos números pares: " + mediaPar);
            }

            perc = (qtdImpar / qtd) * 100;
            System.out.println("Porcentagem de números ímpares: " + perc + "%");
        }

    }
}
