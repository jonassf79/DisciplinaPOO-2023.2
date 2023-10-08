package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior, menor;
        
        maior = Integer.MIN_VALUE; 
        menor = Integer.MAX_VALUE; 
        
        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
            int valor = scanner.nextInt();
            
            if (valor == 0) {
                break; 
            } 
            else if (valor < 0) {
                System.out.println("Valor negativo. Digite um valor positivo.");
            } 
            else {
                
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } 
        else {
            System.out.println("Nenhum valor válido foi inserido.");
        }
	}
     
}
