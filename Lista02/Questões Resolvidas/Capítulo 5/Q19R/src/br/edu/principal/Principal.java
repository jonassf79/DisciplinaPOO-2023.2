package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, soma, i;

        System.out.print("Digite m: ");
        m = scanner.nextInt();

        System.out.print("Digite n: ");
        n = scanner.nextInt();

        while (m < n) {
            soma = 0;
            for (i = m; i <= n; i++) {
                soma += i;
            }
            System.out.println("Soma: " + soma);

            System.out.print("Digite m: ");
            m = scanner.nextInt();

            System.out.print("Digite n: ");
            n = scanner.nextInt();
        }
    }
}
