package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = "4531", senhaTentativa;
		
		System.out.print("Digite a senha para entrar no sistema: ");
		senhaTentativa = sc.nextLine();
		
		if(senhaTentativa.equals(senha)) {
			System.out.println("Acesso permitido.");
		}
		else {
			System.out.println("Acesso negado, tente novamente.");
		}
	}
}
