package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	    double salMin, nht, coeficiente, salBruto, imposto, grat, auxilio, salLiq;
	    String turno, categoria;
	        
	    System.out.print("Informe o salário mínimo: ");
	    salMin = sc.nextDouble();
	        
	    System.out.print("Informe o turno (M, V ou N): ");
	    turno = sc.next();
	        
	    System.out.print("Informe a categoria (O ou N): ");
	    categoria = sc.next();
	        
	    System.out.print("Informe o número de horas trabalhadas: ");
	    nht = sc.nextDouble();
	        
	    if (turno.equals("M")) {
	    	coeficiente = 0.10 * salMin;
	    } 
	    else if (turno.equals("V")) {
	        coeficiente = 0.15 * salMin;
	    } 
	    else if (turno.equals("N")) {
	        coeficiente = 0.12 * salMin;
	    } 
	    else {
	        coeficiente = 0.0;
	    }
	        
	    System.out.println("Coeficiente: " + coeficiente);
	        
	    salBruto = nht * coeficiente;
	    System.out.println("Salário Bruto: " + salBruto);
	        
	    if (categoria.equals("O")) {
	    	if (salBruto >= 300) {
	    		imposto = 0.05 * salBruto;
	    	} 
	    	else {
	    		imposto = 0.03 * salBruto;
	    	}
	    } 
	    else {
	    	if (salBruto >= 400) {
	    		imposto = 0.06 * salBruto;
	    	} 
	    	else {
	    		imposto = 0.04 * salBruto;
	    	}
	    }
	        
	    System.out.println("Imposto: " + imposto);
	        
	    if (turno.equals("N") && nht > 80) {
	    	grat = 50;
	    } 
	    else {
	    	grat = 30;
	    }
	    System.out.println("Gratificação: " + grat);
	        
	    if (categoria.equals("O") || coeficiente <= 25) {
	    	auxilio = (1.0/3) * salBruto;
	    } 
	    else {
	    	auxilio = 0.5 * salBruto;
	    }
	        
	    System.out.println("Auxílio: " + auxilio);
	        
	    salLiq = salBruto - imposto + grat + auxilio;
	    System.out.println("Salário Líquido: " + salLiq);
	        
	    if (salLiq < 350) {
	    	System.out.println("Mal Remunerado");
	    } 
	    else if (salLiq >= 350 && salLiq <= 600) {
	    	System.out.println("Normal");
	    } 
	    else {
	    	System.out.println("Bem Remunerado");
	    }
	        

	}

}
