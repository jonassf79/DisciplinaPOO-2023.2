package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario, aumento, novoSal;
        int cargo;
        
        System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
        cargo = sc.nextInt();       
        
        while(true) {       	      	
         
        	if (cargo == 1) {
        		System.out.print("Digite o valor do salário: ");
                salario = sc.nextDouble();
        		System.out.println("\nO cargo é Escriturário");
        		aumento = salario * 50 / 100;
        		novoSal = salario + aumento;
        		System.out.println("O valor do aumento é: " + aumento + " reais");
        		System.out.println("O novo salário é: " + novoSal + " reais");
        		break;
        	} 
        	
        	else if (cargo == 2) {
        		System.out.print("Digite o valor do salário: ");
                salario = sc.nextDouble();
            	System.out.println("\nO cargo é Secretário");
            	aumento = salario * 35 / 100;
            	novoSal = salario + aumento;
            	System.out.println("O valor do aumento é: " + aumento + " reais");
            	System.out.println("O novo salário é: " + novoSal + " reais");
            	break;
        	} 
        	
        	else if (cargo == 3) {
        		System.out.print("Digite o valor do salário: ");
                salario = sc.nextDouble();
        		System.out.println("\nO cargo é Caixa");
        		aumento = salario * 20 / 100;
        		novoSal = salario + aumento;
        		System.out.println("O valor do aumento é: " + aumento + " reais");
        		System.out.println("O novo salário é: " + novoSal + " reais");
        		break;
        	} 
        
        	else if (cargo == 4) {
        		System.out.print("Digite o valor do salário: ");
                salario = sc.nextDouble();
        		System.out.println("\nO cargo é Gerente");
        		aumento = salario * 10 / 100;
        		novoSal = salario + aumento;
        		System.out.println("O valor do aumento é: " + aumento + " reais");
        		System.out.println("O novo salário é: " + novoSal + " reais");
        		break;
        	} 
        
        	else if (cargo == 5) {
        		System.out.print("Digite o valor do salário: ");
                salario = sc.nextDouble();
        		System.out.println("\nO cargo é Diretor");
        		aumento = salario * 0 / 100;
        		novoSal = salario + aumento;
        		System.out.println("O valor do aumento é: " + aumento + " reais");
        		System.out.println("O novo salário é: " + novoSal + " reais");
        		break;
        	}
        
        	else {
            	System.out.println("Cargo Inexistente. Digite novamente:\n");
            	System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
                cargo = sc.nextInt();       
        	}
        	
        }
	}
}
