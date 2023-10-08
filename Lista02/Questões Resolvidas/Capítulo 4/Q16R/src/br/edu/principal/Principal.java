package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        double preco, venda, novoPre;
	        
	        System.out.println("Digite o preço e o valor da venda: ");
	        System.out.print("Preço: ");
	        preco = sc.nextDouble();
	        System.out.print("Venda: ");
	        venda = sc.nextDouble();
	        
	        if (venda < 500 || preco < 30) {
	            novoPre = preco + (10.0 / 100.0) * preco;
	        } 
	        else if ((venda >= 500 && venda < 1200) || (preco >= 30 && preco < 80)) {
	        	novoPre = preco + (15.0 / 100.0) * preco;
	        } 
	        else if (venda >= 1200 || preco >= 80) {
	            novoPre = preco - (20.0 / 100.0) * preco;
	        } 
	        else {
	            novoPre = preco; 
	        }
	        
	        System.out.println("O novo preço é: " + novoPre + " reais");	        
	}
}
