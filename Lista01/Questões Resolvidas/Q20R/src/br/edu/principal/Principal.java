package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, ang, escada, rad;
		
		System.out.print("Digite a altura(m) da parede: ");
		altura = sc.nextDouble();
		System.out.print("Digite o ângulo formado entre o chão e a escada: ");
		ang = sc.nextDouble();
		
		rad = ang * (Math.PI / 180);
		escada = altura / Math.sin(rad);
		System.out.println("O tamanho da escada é de " + escada + " metros");
	}
}
