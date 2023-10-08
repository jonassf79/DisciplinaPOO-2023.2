package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, soma;
        
        System.out.println("Este programa realiza o somatório dos números primos \nentre o x e y escolhidos.\nPara parar o código, digite o mesmo número\nde x em y.\n");
        
        do {
            System.out.print("Digite valor de x: ");
            x = scanner.nextInt();
            System.out.print("Digite valor de y: ");
            y = scanner.nextInt();

            if (x > y) {
                System.out.println("\nx deve ser menor ou igual a y.\nDigite os valores novamente:\n");
                continue;
            }

            soma = primos(x, y);
            System.out.println("A soma dos números primos entre " + x + " e " + y + " é: " + soma);

        } while (x != y);

        scanner.close();
    }

    public static int primos(int x, int y) {
        int somatorio = 0;

        for (int i = x; i <= y; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                somatorio += i;
            }
        }

        return somatorio;
    }

}
