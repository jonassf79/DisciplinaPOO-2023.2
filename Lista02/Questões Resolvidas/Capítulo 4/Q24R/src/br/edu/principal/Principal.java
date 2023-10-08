package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double pre, valorAdic, imposto;
        double preCusto, desconto, novoPre;
        String tipo, refrig;
        
        System.out.print("Informe o preço: ");
        pre = sc.nextDouble();
        
        System.out.print("Informe o tipo (A, L ou V): ");
        tipo = sc.next();
        
        System.out.print("Informe a refrigeração (S ou N): ");
        refrig = sc.next();
        
        if (refrig.equals("N")) {
            if (tipo.equals("A")) {
                if (pre < 15) {
                    valorAdic = 2.0;
                } 
                else {
                    valorAdic = 5.0;
                }
            } 
            else if (tipo.equals("L")) {
                if (pre < 10) {
                    valorAdic = 1.50;
                } 
                else {
                    valorAdic = 2.50;
                }
            } 
            else if (tipo.equals("V")) {
                if (pre < 30) {
                    valorAdic = 3.0;
                } 
                else {
                    valorAdic = 2.5;
                }
            } 
            else {
                valorAdic = 0.0;
            }
        } 
        else {
            if (tipo.equals("A")) {
                valorAdic = 8.0;
            } 
            else if (tipo.equals("L") || tipo.equals("V")) {
                valorAdic = 0.0;
            } 
            else {
                valorAdic = 0.0;
            }
        }
        
        System.out.println("Valor Adicional: " + valorAdic);
        
        if (pre < 25) {
            imposto = 0.05 * pre;
        } 
        else {
            imposto = 0.08 * pre;
        }
        
        System.out.println("Imposto: " + imposto);
        
        preCusto = pre + imposto;
        System.out.println("Preço de Custo: " + preCusto);
        
        if (!tipo.equals("A") && !refrig.equals("S")) {
            desconto = 0.03 * preCusto;
        } 
        else {
            desconto = 0.0;
        }
        
        System.out.println("Desconto: " + desconto);
        
        novoPre = preCusto + valorAdic - desconto;
        System.out.println("Novo Preço: " + novoPre);
        
        if (novoPre <= 50) {
            System.out.println("Barato");
        } 
        else if (novoPre < 100) {
            System.out.println("Normal");
        } 
        else {
            System.out.println("Caro");
        }
        

	}

}
