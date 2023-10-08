package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] conta = new int[10];
        double[] saldo = new double[10];
        int i, j, codigo, op;
        double valor, soma;
        boolean achou;

        for (i = 0; i < 10; i++) {
            achou = false;
            do {
                System.out.print("Digite o número da conta " + (i + 1) + ": ");
                conta[i] = scanner.nextInt();

                for (j = 0; j < i; j++) {
                    if (conta[i] == conta[j]) {
                        achou = true;
                        break;
                    }
                }

            } while (achou);

            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldo[i] = scanner.nextDouble();
        }

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar saque");
            System.out.println("3. Consultar saldo total");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            achou = false;

            switch (op) {
                case 1:
                    System.out.print("Digite o código da conta e o valor a ser depositado: ");
                    codigo = scanner.nextInt();
                    valor = scanner.nextDouble();

                    for (i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            saldo[i] += valor;
                            achou = true;
                            System.out.println("Depósito efetuado");
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 2:
                    System.out.print("Digite o código da conta e o valor a ser sacado: ");
                    codigo = scanner.nextInt();
                    valor = scanner.nextDouble();

                    for (i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            if (saldo[i] < valor) {
                                System.out.println("Saldo insuficiente");
                            } 
                            else {
                                saldo[i] -= valor;
                                achou = true;
                                System.out.println("Saque efetuado");
                            }
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 3:
                    soma = 0;
                    for (i = 0; i < 10; i++) {
                        soma += saldo[i];
                    }
                    System.out.println("Saldo total: " + soma);
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (op != 4);

	}
}
