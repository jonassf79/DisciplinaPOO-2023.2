package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaUm, mesUm, anoUm, diaDois, mesDois, anoDois;
		
		System.out.println("Digite a primeira data: ");
		System.out.print("Dia: ");
		diaUm = sc.nextInt();
		System.out.print("Mes: ");
		mesUm = sc.nextInt();
		System.out.print("Ano: ");
		anoUm = sc.nextInt();
		System.out.println(" ");
		System.out.println("Digite a segunda data: ");
		System.out.print("Dia: ");
		diaDois = sc.nextInt();
		System.out.print("Mes: ");
		mesDois = sc.nextInt();
		System.out.print("Ano: ");
		anoDois = sc.nextInt();

		if (anoUm > anoDois) {
			System.out.println("A maior data é: " + diaUm + "/" + mesUm + "/" + anoUm);
		}
		else if(anoUm < anoDois) {
			System.out.println("A maior data é: " + diaDois + "/" + mesDois + "/" + anoDois);
		}	
		else if (mesUm > mesDois) {
			System.out.println("A maior data é: " + diaUm + "/" + mesUm + "/" + anoUm);
		}
		else if (mesDois > mesUm) {
			System.out.println("A maior data é: " + diaDois + "/" + mesDois + "/" + anoDois);
		}
		else if (diaUm > diaDois) {
			System.out.println("A maior data é: " + diaUm + "/" + mesUm + "/" + anoUm);
		}
		else if (diaDois > diaUm) {
			System.out.println("A maior data é: " + diaDois + "/" + mesDois + "/" + anoDois);
		}
		else {
			System.out.println("As datas são iguais!");
		}
		
	}

}
