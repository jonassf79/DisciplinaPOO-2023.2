package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;

		do {
            System.out.print("Digite a base: ");
            base = sc.nextDouble();
        } while (base <= 0);
        
        do {
            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();
        } while (altura <= 0);
        
        area = base * altura / 2;
        
        System.out.println("A área é: " + area);

	}

}
