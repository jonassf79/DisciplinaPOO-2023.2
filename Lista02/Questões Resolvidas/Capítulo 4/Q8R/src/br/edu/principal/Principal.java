package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose; 
		
		System.out.println("=======MENU=======");
		System.out.println("[1] Somar dois números: ");
		System.out.println("[2] Raiz Quadrada de um número\n");
		System.out.print("Digite o número da operação que deseja realizar:");
		choose = sc.nextInt();
		System.out.println(" ");
		
		while(choose != 1 && choose != 2) {
			System.out.println("Digite apenas opções válidas (1 ou 2)\n");
			System.out.println("=======MENU=======");
			System.out.println("[1] Somar dois números: ");
			System.out.println("[2] Raiz Quadrada de um número\n");
			System.out.print("Digite o número da operação que deseja realizar:");
			choose = sc.nextInt();
			System.out.println(" ");
		}
		if(choose ==1) {
			double numbUm, numbDois;
			System.out.println("Digite os números que deseja somar: ");
			System.out.print("número 1> ");
			numbUm = sc.nextDouble();
			System.out.print("número 2> ");
			numbDois = sc.nextDouble();
			
			System.out.println("A soma dos números resulta em: " +(numbUm + numbDois)); 
		}
		
		else if(choose == 2) {
			double numb;
			System.out.print("Digite o número que deseja calcular a raíz quadrada:\n> ");
			numb = sc.nextDouble();
			System.out.println("A raíz quadrado do número resulta em: " + Math.sqrt(numb));
			
		}
	}
	
}
