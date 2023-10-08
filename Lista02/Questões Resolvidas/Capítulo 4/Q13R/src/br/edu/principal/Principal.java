package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int op;
        double sal, imp, aum, novoSal;
        
        System.out.println("===MENU DE OPÇÕES===");
        System.out.println("1 - IMPOSTO");
        System.out.println("2 - NOVO SALÁRIO");
        System.out.println("3 - CLASSIFICAÇÃO\n");
        System.out.print("Digite a opção desejada: ");
        op = sc.nextInt();
        
        while(true) {
        	
        	if (op == 1) {
                System.out.println("Informe o salário:");
                sal = sc.nextDouble();
                if (sal < 500) {
                    imp = sal * 5 / 100;
                } 
                else if (sal >= 500 && sal <= 850) {
                    imp = sal * 10 / 100;
                } 
                else {
                    imp = sal * 15 / 100;
                }
                System.out.println("O valor do imposto é: " + imp + " reais");
                break;
        	}
        	
        	else if (op == 2) {
                System.out.println("Informe o salário:");
                sal = sc.nextDouble();
                if (sal > 1500) {
                    aum = 25;
                } 
                else if (sal >= 750 && sal <= 1500) {
                    aum = 50;
                } 
                else if (sal >= 450 && sal < 750) {
                    aum = 75;
                } 
                else {
                    aum = 100;
                }
                novoSal = sal + aum;
                System.out.println("O novo salário é: " + novoSal + " reais");
                break;
            }
        	
            else if (op == 3) {
                System.out.println("Informe o salário:");
                sal = sc.nextDouble();
                if (sal <= 700) {
                    System.out.println("Mal Remunerado");
                } 
                else {
                    System.out.println("Bem Remunerado");
                }
                break;
            }
        	
            else {
                System.out.println("Opção Inválida. Digite novamente:\n ");
                System.out.println("===MENU DE OPÇÕES===");
                System.out.println("1 - IMPOSTO");
                System.out.println("2 - NOVO SALÁRIO");
                System.out.println("3 - CLASSIFICAÇÃO\n");
                System.out.print("Digite a opção desejada: ");
                op = sc.nextInt();
            }
        }

	}

}
