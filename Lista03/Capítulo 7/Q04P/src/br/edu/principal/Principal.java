package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAlunos = 15;
        int numProvas = 5;

        String[] nomesAlunos = new String[numAlunos];
        double[][] notas = new double[numAlunos][numProvas];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomesAlunos[i] = input.nextLine();

            for (int j = 0; j < numProvas; j++) {
                System.out.println("Digite a nota da prova " + (j + 1) + " para o aluno " + nomesAlunos[i] + ": ");
                notas[i][j] = input.nextDouble();
            }
            input.nextLine();
        }

        double somaNotasClasse = 0;
        for (int i = 0; i < numAlunos; i++) {
            for (int j = 0; j < numProvas; j++) {
                somaNotasClasse += notas[i][j];
            }
        }
        double mediaClasse = somaNotasClasse / (numAlunos * numProvas);

        System.out.println("\nResultados dos Alunos:");
        for (int i = 0; i < numAlunos; i++) {
            double somaNotasAluno = 0;
            for (int j = 0; j < numProvas; j++) {
                somaNotasAluno += notas[i][j];
            }
            double mediaAluno = somaNotasAluno / numProvas;

            String situacao;
            if (mediaAluno >= 7.0) {
                situacao = "Aprovado";
            } else if (mediaAluno >= 4.0) {
                situacao = "Exame";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Nome: " + nomesAlunos[i]);
            System.out.println("Média: " + mediaAluno);
            System.out.println("Situação: " + situacao);
            System.out.println();
        }

        System.out.println("Média da Classe: " + mediaClasse);
    }
}

