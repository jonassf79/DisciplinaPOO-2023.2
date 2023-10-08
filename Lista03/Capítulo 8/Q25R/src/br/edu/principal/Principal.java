package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner (System.in);
		int[] vetor = new int[25];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor "+ (i+1)  +" do vetor: ");
			vetor[i] = sc.nextInt();
		}
		substituicao(vetor);
		
	}
	public static void substituicao(int x[]) {
		for (int i = 0; i < x.length; i++) {
			if(x[i] < 0) {
				x[i] = 0;
			}
		}
		System.out.println(" ");
		for (int i = 0; i < x.length; i++) {
			System.out.println("O valor " + (i+1) + " do vetor é: " + x[i]);
		}
	}
	
}
