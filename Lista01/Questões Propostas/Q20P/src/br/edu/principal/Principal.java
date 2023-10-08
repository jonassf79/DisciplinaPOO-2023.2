package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a medida do ângulo em graus: ");
	        double angulo = scanner.nextDouble();

	        System.out.print("Digite a distância da escada até a parede: ");
	        double distanciaParede = scanner.nextDouble();

	        double radianos = Math.toRadians(angulo);
	        double comprimentoEscada = distanciaParede / Math.cos(radianos);

	        System.out.println("O comprimento da escada necessário é: " + comprimentoEscada);

	        scanner.close();
	    }
}
