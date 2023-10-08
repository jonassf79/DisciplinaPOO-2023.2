package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double escada, alturaParede, distancia;
		
		System.out.print("Digite o tamanho da escada: ");
		escada = sc.nextDouble();
		System.out.print("Digite a altura que deseja fixar o quadro: ");
		alturaParede = sc.nextDouble();
		
		if(alturaParede>escada) {
			System.out.println(" ");
			System.out.print("O tamanho da escada tem que ser maior!!! \n");
			System.out.println(" ");
			System.out.print("Digite o tamanho da escada: ");
			escada = sc.nextDouble();
			System.out.print("Digite a altura que deseja fixar o quadro: ");
			alturaParede = sc.nextDouble();
			
			distancia = Math.pow(escada, 2) - Math.pow(alturaParede, 2);
			distancia = Math.sqrt(distancia);
			System.out.println("A distância que a escada deverá ficar resulta em: " + distancia + " metros");
		}
		else {
			distancia = Math.pow(escada, 2) - Math.pow(alturaParede, 2);
			distancia = Math.sqrt(distancia);
			System.out.println("A distância que a escada deverá ficar resulta em: " + distancia + " metros");
		}
	}
}
