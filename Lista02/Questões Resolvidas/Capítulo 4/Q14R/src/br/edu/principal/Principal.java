package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario, novoSal, bonif, auxilio;
        
        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        
        if (salario <= 500) {
            bonif = salario * 5 / 100;
        } 
        else if (salario <= 1200) {
            bonif = salario * 12 / 100;
        } 
        else {
            bonif = 0;
        }
        
        if (salario <= 600) {
            auxilio = 150;
        } 
        else {
            auxilio = 100;
        }
        
        novoSal = salario + bonif + auxilio;
        
        System.out.println("O novo salário é: " + novoSal + " reais");
        

	}

}
