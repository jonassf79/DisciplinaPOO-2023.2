package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int AgeList [] = new int[9];
		int contUm = 0, contDois = 0, contTres = 0, contQua = 0 , contCin = 0;
		double percentUm = 0, percentDois = 0;
		
		for (int i = 1; i < AgeList.length; i++) {
			int AgeScanner;
			System.out.print("Digite a idade da pessoa "+ i +": " );
			AgeScanner = sc.nextInt();
			if (AgeScanner <= 15) {
				contUm ++;				
				percentUm += 12.5;
			}
			else if(AgeScanner > 15 && AgeScanner <= 30) {
				contDois ++;
			}
			else if(AgeScanner > 30 && AgeScanner <= 45) {
				contTres ++;
			}
			else if(AgeScanner > 45 && AgeScanner <= 60) {
				contQua ++;
			}
			else {
				contCin ++;
				percentDois += 12.5;
			}
		}
		System.out.println("\nA quantidade de pessoas na primeira faixa etária é: " + contUm);
		System.out.println("A quantidade de pessoas na segunda faixa etária é: " + contDois);
		System.out.println("A quantidade de pessoas na terceira faixa etária é: " + contTres);
		System.out.println("A quantidade de pessoas na quarta faixa etária é: " + contQua);
		System.out.println("A quantidade de pessoas na quinta faixa etária é: " + contCin);
		System.out.println("========PORCENTAGENS=========");
		System.out.println("A porcentagem de pessoas na primeira faixa etária é de: " + percentUm + "%");
		System.out.println("A porcentagem de pessoas na segunda faixa etária é de: " + percentDois + "%");
	}
	
}
