package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codEst, codCarga;
        double pesoTon, pesoKg, preCarga, imposto, valorTotal;
        
        System.out.print("Digite o código do estado (1 a 5): ");
        codEst = sc.nextInt();
        
        System.out.print("Digite o peso da carga em toneladas: ");
        pesoTon = sc.nextDouble();
        
        System.out.print("Digite o código da carga (10 a 40): ");
        codCarga = sc.nextInt();
        System.out.println(" ");
        
        pesoKg = pesoTon * 1000;
        System.out.println("Peso em quilos: " + pesoKg);
        
        if (codCarga >= 10 && codCarga <= 20) {
            preCarga = 100 * pesoKg;
        } 
        else if (codCarga >= 21 && codCarga <= 30) {
            preCarga = 250 * pesoKg;
        } 
        else if (codCarga >= 31 && codCarga <= 40) {
            preCarga = 340 * pesoKg;
        } 
        else {
            preCarga = 0;
        }
        
        System.out.println("Preço da carga: " + preCarga);
        
        switch (codEst) {
            case 1:
                imposto = 35.0 / 100.0 * preCarga;
                break;
            case 2:
                imposto = 25.0 / 100.0 * preCarga;
                break;
            case 3:
                imposto = 15.0 / 100.0 * preCarga;
                break;
            case 4:
                imposto = 5.0 / 100.0 * preCarga;
                break;
            case 5:
                imposto = 0;
                break;
            default:
                imposto = 0;
                break;
        }
        
        System.out.println("Imposto: " + imposto);
        
        valorTotal = preCarga + imposto;
        System.out.println("Valor total: " + valorTotal);
        

	}

}
