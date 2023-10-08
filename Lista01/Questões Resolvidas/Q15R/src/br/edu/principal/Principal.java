package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double precoFab, percentLucDist, percentImps, valorDist, valorImps, precoFin;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o preço da fabrica do automóvel: ");
		precoFab = input.nextDouble();
		
		System.out.print("Digite o percentual que irá para a distribuidora: ");
		percentLucDist = input.nextDouble();
		
		System.out.print("Digite o percentual de imposto: ");
		
		percentImps = input.nextDouble();
		valorDist = precoFab * (percentLucDist/100);
		valorImps = precoFab * (percentImps/100);
		precoFin = precoFab + valorDist + valorImps;
		
		System.out.println("O valor de lucro para distribuidora é de: " + valorDist + " reais");
		System.out.println("O valor de impostos: " + valorImps + " reais");
		System.out.println("O preço final do automóvel resultou em: " + precoFin + " reais");
	}
	
}
