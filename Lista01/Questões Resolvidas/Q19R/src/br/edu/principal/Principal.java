package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double degrau, altura, degrausTotal;
		
		System.out.print("Digite a altura(m) total que deseja subir: ");
		altura = sc.nextInt();
		System.out.print("Digite a altura(m) do degrau: ");
		degrau = sc.nextInt();
		
		degrausTotal = altura/degrau;
		System.out.println("A quantidade de degraus que deverá ser subida é de: " + degrausTotal);

	}

}
