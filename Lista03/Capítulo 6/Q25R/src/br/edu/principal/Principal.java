package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
        int[] primos = new int[10];
        int num = 101;
        int qtde = 1;

        while (qtde <= 10) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores <= 2) {
                primos[qtde - 1] = num;
                qtde++;
            }

            num++;
        }

        System.out.println("Os 10 primeiros números primos após 100 são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(primos[i]);
        }
    }
}
