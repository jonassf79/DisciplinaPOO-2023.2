package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int i, num_termos, num1, num2, num3;

	    System.out.print("Digite o número de termos desejado: ");
	    num_termos = scanner.nextInt();

	    num1 = 2;
	    num2 = 7;
	    num3 = 3;

	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);

	    i = 4;

	    while (i != num_termos) {
	    	num1 = num1 * 2;
	    	System.out.println(num1);
	    	i = i + 1;

	    	if (i != num_termos) {
	    		num2 = num2 * 3;
	    		System.out.println(num2);
	    		i = i + 1;
	        }

	    	if (i != num_termos) {
	    		num3 = num3 * 4;
	    		System.out.println(num3);
	    		i = i + 1;
	        }
	    }
	}
}
