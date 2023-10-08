package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ageNow, ageAfter, year, yearBorn ;
		
		System.out.print("Digite o ano atual: ");
		year = sc.nextInt();
		
		System.out.print("Digite o ano que você nasceu: ");
		yearBorn = sc.nextInt();
		
		ageNow = year - yearBorn;
		ageAfter = 2050 - yearBorn;
		
		System.out.println("A sua idade atual é: " + ageNow);
		System.out.println("A sua idade em 2050 é: " + ageAfter);
	}

}
