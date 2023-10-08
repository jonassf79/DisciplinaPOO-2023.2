package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int codProd, codPais;
        double pesoQuilos, pesoGramas, preTotal, imposto, valorTotal, preGrama;
        
        System.out.print("Digite o código do produto (1 a 10): ");
        codProd = sc.nextInt();
        
        System.out.print("Digite o peso em quilos: ");
        pesoQuilos = sc.nextDouble();
        
        System.out.print("Digite o código do país (1, 2 ou 3): ");
        codPais = sc.nextInt();
        
        System.out.println(" ");
        
        pesoGramas = pesoQuilos * 1000;
        System.out.println("Peso em gramas: " + pesoGramas + "g");
        
        if (codProd >= 1 && codProd <= 4) {
            preGrama = 10;
        } 
        else if (codProd >= 5 && codProd <= 7) {
            preGrama = 25;
        } 
        else if (codProd >= 8 && codProd <= 10) {
            preGrama = 35;
        } 
        else {
            preGrama = 0;
        }
        
        preTotal = pesoGramas * preGrama;
        System.out.println("Preço total: " + preTotal + " reais");
        
        if (codPais == 1) {
            imposto = 0;
        } 
        else if (codPais == 2) {
            imposto = preTotal * 15 / 100;
        } 
        else if (codPais == 3) {
            imposto = preTotal * 25 / 100;
        } 
        else {
            imposto = 0;
        }
        
        System.out.println("Imposto: " + imposto+ " reais");
        
        valorTotal = preTotal + imposto;
        System.out.println("Valor total: " + valorTotal +" reais" );
        

	}

}
