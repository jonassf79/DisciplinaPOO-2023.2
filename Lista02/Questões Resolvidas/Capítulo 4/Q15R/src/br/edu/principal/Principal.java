package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double salMin, nht, ndep, nhet;
        double salReceber, vh, smes, vdep, vhe, imp, salBruto, salLiq, grat;
        
        System.out.print("Digite o salário mínimo: ");
        salMin = sc.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        nht = sc.nextDouble();
        
        System.out.print("Digite o número de dependentes: ");
        ndep = sc.nextDouble();
        
        System.out.print("Digite o número de horas extras trabalhadas: ");
        nhet = sc.nextDouble();
        
        vh = (1.0 / 5.0) * salMin;
        smes = nht * vh;
        vdep = 32 * ndep;
        vhe = nhet * (vh + (vh * 50 / 100));
        
        salBruto = smes + vdep + vhe;
        
        if (salBruto < 200) {
            imp = 0;
        } 
        else if (salBruto >= 200 && salBruto <= 500) {
            imp = salBruto * 10 / 100;
        } 
        else {
            imp = salBruto * 20 / 100;
        }
        
        salLiq = salBruto - imp;
        
        if (salLiq <= 350) {
            grat = 100;
        } 
        else {
            grat = 50;
        }
        
        salReceber = salLiq + grat;
        
        System.out.println("O salário a receber é: " + salReceber + " reais");
        

	}

}
