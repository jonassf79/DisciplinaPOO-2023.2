package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numUm, numDois, numTres;
		
		System.out.print("Digite o primeiro número: ");
		numUm = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		numDois = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		numTres = sc.nextInt();
		
		if(numUm < numDois && numUm < numTres) {
			if(numDois < numTres) {
				System.out.println("A ordem crescente dos números é: "+ numUm + " - " + numDois + " - " + numTres);	
			}
			else {
				System.out.println("A ordem crescente dos números é: "+ numUm + " - " + numTres + " - " + numDois);	
			}
		}
		else if (numDois < numUm && numDois < numTres) {
			if(numUm < numTres) {
				System.out.println("A ordem crescente dos números é: "+ numDois + " - " + numUm + " - " + numTres);	
			}
			else {
				System.out.println("A ordem crescente dos números é: "+ numDois + " - " + numTres + " - " + numUm);	
			}		
		}
		else if(numTres < numUm && numTres < numDois) {
			if(numUm < numDois) {
				System.out.println("A ordem crescente dos números é: "+ numTres + " - " + numUm + " - " + numDois);
			}
			else {
				System.out.println("A ordem crescente dos números é: "+ numTres + " - " + numDois + " - " + numUm);	
			}
		}
			
	}
}
