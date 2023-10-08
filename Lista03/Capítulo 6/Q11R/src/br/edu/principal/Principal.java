package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		double tempmes [] = new double[12];

		
		for(int i=0; i<12; i++) {
			System.out.print("digite a temperatura no mes "+(i+1)+":");
			double mes = scanner.nextDouble();
			tempmes[i] = mes;
		}
		
		double x = Double.MIN_VALUE;
		for(int i=0; i<12; i++) {
			
			if(tempmes[i] > x) {
				x = tempmes[i];
			}
		}

		double x1 = 0;
		
		for(int i=0; i<12; i++) {
			if(tempmes[i] == x) {
				x1 = i;
			}
			
		}
				
		double y = Double.MAX_VALUE;
		for(int i=0; i<12; i++) {

			if(tempmes[i] < y) {
				y = tempmes[i];
			}
		}
		
		double y1 = 0;
		
		for(int i=0; i<12; i++) {
			if(tempmes[i] == y) {
				y1 = i;
			}
		}
		
		String nomemes = "";
		if(x1==0) {
			nomemes = "Janeiro";
		}else if(x1==1) {
			nomemes = "Fevereiro";
		}else if(x1==2) {
			nomemes = "Março";
		}else if(x1==3) {
			nomemes = "Abril";
		}else if(x1==4) {
			nomemes = "Maio";
		}else if(x1==5) {
			nomemes = "Junho";
		}else if(x1==6) {
			nomemes = "Julho";
		}else if(x1==7) {
			nomemes = "Agosto";
		}else if(x1==8) {
			nomemes = "Setembro";
		}else if(x1==9) {
			nomemes = "Outubro";
		}else if(x1==10) {
			nomemes = "Novembro";
		}else if(x1==11) {
			nomemes = "Dezembro";
		}
		
		String nomemes1 = "";
		
		if(y1==0) {
			nomemes1 = "Janeiro";
		}else if(y1==1) {
			nomemes1 = "Fevereiro";
		}else if(y1==2) {
			nomemes1 = "Março";
		}else if(y1==3) {
			nomemes1 = "Abril";
		}else if(y1==4) {
			nomemes1 = "Maio";
		}else if(y1==5) {
			nomemes1 = "Junho";
		}else if(y1==6) {
			nomemes1 = "Julho";
		}else if(y1==7) {
			nomemes1 = "Agosto";
		}else if(y1==8) {
			nomemes1 = "Setembro";
		}else if(y1==9) {
			nomemes1 = "Outubro";
		}else if(y1==10) {
			nomemes1 = "Novembro";
		}else if(y1==11) {
			nomemes1 = "Dezembro";
		}else 
			
		System.out.println("");
		System.out.println("");
		System.out.println("A maior temperatura esta no mes de "+nomemes);
		System.out.println("E a temperatura é: "+x+"°C");
		System.out.println("");
		System.out.println("A menor temperatura esta no mes de "+nomemes1);
		System.out.println("E a temperatura é: "+y+"°C");
	}
	

}
