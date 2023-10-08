package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto, candidatoUm = 0, candidatoDois = 0, candidatoTres = 0, candidatoQuatro = 0, branco = 0, nulo = 0, totalVotos = 0;
		double porcentNulo, porcentBranco;
		
		while(true) {
			System.out.print("\nDigite o candidato que deseja votar \n [1] Candidato Um\n [2] Candidato Dois\n [3] Candidato Três\n [4] Candidato Quatro\n [5] Nulo\n [6] Branco\n [0] Encerrar\n >  ");
			voto = sc.nextInt();
			if (voto == 1) {
				candidatoUm++;
				totalVotos++;			
			}
			else if(voto == 2) {
				candidatoDois++;
				totalVotos++;				
			}
			else if(voto == 3) {
				candidatoTres++;
				totalVotos++;				
			}
			else if(voto == 4) {
				candidatoQuatro++;
				totalVotos++;				
			}
			else if(voto == 5) {
				nulo++;
				totalVotos++;
				System.out.println("\nvoto nulo");
				
			}
			else if(voto == 6) {
				branco++;
				totalVotos++;
				System.out.println("\nvoto em branco");				
			}
			else if(voto == 0) {
				System.out.println("\nObrigado por utilizar nossa urna.");
				break;
			}
			else {
				System.out.println("\nValor inválido");
			}
		}
		System.out.println("A quantidade de votos no candidato 1 foram: " + candidatoUm + " votos");
		System.out.println("A quantidade de votos no candidato 2 foram: " + candidatoDois + " votos");
		System.out.println("A quantidade de votos no candidato 3 foram: " + candidatoTres + " votos");
		System.out.println("A quantidade de votos no candidato 4 foram: " + candidatoQuatro + " votos");
		System.out.println("A quantidade de votos em branco foram: " + branco + " votos");
		System.out.println("A quantidade de votos nulos foram: " + nulo + " votos");
		
		porcentNulo = (nulo * 100.0) / totalVotos;
		porcentBranco = (branco * 100.0) / totalVotos;
		System.out.println("A porcentagem de votos nulos em relação ao total é de: "+ porcentNulo+"%");
		System.out.println("A porcentagem de votos em branco em relação ao total é de: "+ porcentBranco +"%");
	}

}
