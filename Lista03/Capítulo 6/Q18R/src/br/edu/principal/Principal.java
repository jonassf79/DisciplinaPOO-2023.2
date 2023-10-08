package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] dado = new int[20];
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número sorteado na jogada " + (i + 1) + ": ");
            dado[i] = scanner.nextInt();

            while (dado[i] < 1 || dado[i] > 6) {
                System.out.print("Digite um número válido entre 1 e 6: ");
                dado[i] = scanner.nextInt();
            }
        }

        System.out.println("Números sorteados:");
        for (int i = 0; i < 20; i++) {
            System.out.println(dado[i]);
        }

        for (int i = 0; i < 20; i++) {
            if (dado[i] == 1) {
                num1++;
            } else if (dado[i] == 2) {
                num2++;
            } else if (dado[i] == 3) {
                num3++;
            } else if (dado[i] == 4) {
                num4++;
            } else if (dado[i] == 5) {
                num5++;
            } else if (dado[i] == 6) {
                num6++;
            }
        }

        System.out.println("O número 1 foi sorteado " + num1 + " vez(es)");
        System.out.println("O número 2 foi sorteado " + num2 + " vez(es)");
        System.out.println("O número 3 foi sorteado " + num3 + " vez(es)");
        System.out.println("O número 4 foi sorteado " + num4 + " vez(es)");
        System.out.println("O número 5 foi sorteado " + num5 + " vez(es)");
        System.out.println("O número 6 foi sorteado " + num6 + " vez(es)");
     
      	}
}
