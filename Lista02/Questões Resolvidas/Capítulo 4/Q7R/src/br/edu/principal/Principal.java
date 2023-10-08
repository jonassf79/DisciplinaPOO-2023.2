package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA, numB, numC, optionI;
		
		System.out.print("Digite um valor para A: ");
		numA = sc.nextInt();
		System.out.print("Digite um valor para B: ");
		numB = sc.nextInt();
		System.out.print("Digite um valor para C: ");
		numC = sc.nextInt();
		
		System.out.print("Digite um valor para I (1, 2 ou 3): ");
		optionI = sc.nextInt();
		while(true) {
			if (optionI == 1) {
				if(numA < numB && numA < numC) {
					if(numB < numC) {
						System.out.print("A ordem crescente dos números é: " + numA + " - " + numB + " - " + numC);
						break;
					}else {
						System.out.print("A ordem crescente dos números é: " + numA + " - " + numC + " - " + numB);
						break;
					}
				}
				if(numB < numA && numB < numC) {
					if(numA < numC) {
						System.out.print("A ordem crescente dos números é: " + numB + " - " + numA + " - " + numC);
						break;
					}else {
						System.out.print("A ordem crescente dos números é: " + numB + " - " + numC + " - " + numA);
						break;
					}				
				}
				if(numC < numA && numC < numB) {
					if(numA < numB) {
						System.out.print("A ordem crescente dos números é: " + numC + " - " + numB + " - " + numA);
						break;
					}else {
						System.out.print("A ordem crescente dos números é: " + numC + " - " + numA + " - " + numB);
						break;
					}
				}
			}
			else if (optionI == 2) {
				if(numA > numB && numA > numC) {
					if(numB > numC) {
						System.out.print("A ordem decrescente dos números é: " + numA + " - " + numB + " - " + numC);
						break;
					}else {
						System.out.print("A ordem crescente dos números é: " + numA + " - " + numC + " - " + numB);
						break;
					}
				}
				if(numB > numA && numB > numC) {
					if(numA > numC) {
						System.out.print("A ordem decrescente dos números é: " + numB + " - " + numA + " - " + numC);
						break;
					}else {
						System.out.print("A ordem decrescente dos números é: " + numB + " - " + numC + " - " + numA);
						break;
					}				
				}
				if(numC > numA && numC > numB) {
					if(numA > numB) {
						System.out.print("A ordem decrescente dos números é: " + numC + " - " + numB + " - " + numA);
						break;
					}else {
						System.out.print("A ordem decrescente dos números é: " + numC + " - " + numA + " - " + numB);
						break;
					}
				}
			}
			else if(optionI == 3) {
				if(numA > numB && numA > numC) {					
					System.out.print("A ordem dejada dos números é: " + numA + " - " + numB + " - " + numC);
					break;
				}
				if(numB > numA && numB > numC) {
					System.out.print("A ordem desejada dos números é: " + numB + " - " + numA + " - " + numC);												
					break;
				}
				if(numC > numA && numC > numB) {
					System.out.print("A ordem desejada dos números é: " + numC + " - " + numB + " - " + numA);					
					break;
				}			
			}
			else {
				System.out.println("\nDigite uma opção válida: ");
				System.out.print("Digite um valor para I (1, 2 ou 3): ");
				optionI = sc.nextInt();
			}
			
		}
	}
}
