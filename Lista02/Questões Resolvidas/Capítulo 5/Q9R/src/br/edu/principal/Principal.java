package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int cont, tr, te, ta;
        double n1, n2, media, totalClasse, mediaClasse;

        tr = te = ta = 0;
        totalClasse = 0;

        for (cont = 1; cont <= 6; cont++) {
            System.out.print("Informe a nota 1 do aluno " + cont + ": ");
            n1 = scanner.nextDouble();
            System.out.print("Informe a nota 2 do aluno " + cont + ": ");
            n2 = scanner.nextDouble();

            media = (n1 + n2) / 2;
            System.out.println("Média do aluno " + cont + ": " + media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                te++;
                System.out.println("Exame");
            } else {
                ta++;
                System.out.println("Aprovado");
            }

            totalClasse += media;
        }

        System.out.println("Quantidade de reprovados: " + tr);
        System.out.println("Quantidade de exames: " + te);
        System.out.println("Quantidade de aprovados: " + ta);

        mediaClasse = totalClasse / 6;
        System.out.println("Média da classe: " + mediaClasse);


	}

}
