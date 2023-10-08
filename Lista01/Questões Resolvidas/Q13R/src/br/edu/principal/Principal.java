package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pes, poleg, jard, milh;
		
		System.out.println("Conversão de Unidades de Distância");
		System.out.println("==================================");
		System.out.print("Digite a medida em pés para realizar a conversão: ");
		pes = input.nextDouble();
		
		poleg = pes * 12;
		jard = pes / 3;
		milh = jard / 1760;
		
		System.out.println("A medida em polegadas dessa medida de pés é: " + poleg + " polegadas");
		System.out.println("A medida em jardas dessa medida de pés é: " + jard + " jardas");
		System.out.println("A medida em milhas dessa medida de jardas é: " + milh + " milhas");
	}

}
