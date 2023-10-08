package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double imp, grat, sala, salarioFin;
		
		System.out.print("Digite o salário do funcionário: ");
		sala = input.nextDouble();
		
		imp = sala * 0.07;
		grat = sala * 0.05;
		salarioFin = sala + grat - imp;
		System.out.println("O salário final resultou em: " + salarioFin + " reais");
	}

}
