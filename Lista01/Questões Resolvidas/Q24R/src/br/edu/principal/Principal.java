package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora, m, convert;
		
		System.out.print("Digite as horas (horas.minutos): ");
		hora = sc.nextDouble();
		int h = (int)hora;
		m = hora - h;
		convert = (h * 60) + (m * 100);
		
		System.out.println("O número de horas digitado em minutos resulta em: " + convert + " minutos");

	}

}
