package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        double salBase, tempo, imposto, grat, salLiq;
        
        System.out.println("Digite o salário base: ");
        salBase = sc.nextDouble();
        
        System.out.println("Digite o tempo de serviço (em anos): ");
        tempo = sc.nextDouble();
        
        if (salBase < 200) {
            imposto = 0;
        } 
        else if (salBase <= 450) {
            imposto = (3.0 / 100.0) * salBase;
        } 
        else if (salBase < 700) {
            imposto = (8.0 / 100.0) * salBase;
        } 
        else {
            imposto = (12.0 / 100.0) * salBase;
        }
        
        System.out.println("Imposto: " + imposto);
        
        if (salBase > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                if (tempo < 6) {
                    grat = 35;
                } else {
                    grat = 33;
                }
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo < 6) {
                grat = 35;
            } else {
                grat = 33;
            }
        }
        
        System.out.println("Gratificação: " + grat);
        
        salLiq = salBase - imposto + grat;
        System.out.println("Salário líquido: " + salLiq);
        
        if (salLiq <= 350) {
            System.out.println("Classificação A");
        } 
        else if (salLiq < 600) {
            System.out.println("Classificação B");
        } 
        else {
            System.out.println("Classificação C");
        }
        
	}
}
