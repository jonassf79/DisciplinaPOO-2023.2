package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite a medida do primeiro ângulo: ");
	        double angulo1 = scanner.nextDouble();
	        
	        System.out.println("Digite a medida do segundo ângulo: ");
	        double angulo2 = scanner.nextDouble();
	        
	        double angulo3 = 180 - (angulo1 + angulo2);
	        
	        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");
	    }
}
