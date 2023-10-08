package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int horaInicio, minInicio, horaFin, minFin, horaDurac, minDurac;
        
        System.out.println("Digite o horário inicial");
        System.out.print("hora: ");
        horaInicio = input.nextInt();
        System.out.print("minuto: ");
        minInicio = input.nextInt();
        
        System.out.println("\nDigite o horário final ");
        System.out.print("hora: ");
        horaFin = input.nextInt();
        System.out.print("minuto: ");
        minFin = input.nextInt();
        
        if (minInicio > minFin) {
            minFin += 60;
            horaFin--;
        }
        
        if (horaInicio > horaFin) {
            horaFin += 24;
        }
        
        minDurac = minFin - minInicio;
        horaDurac = horaFin - horaInicio;
        
        System.out.println("\nO jogo durou " + horaDurac + " hora(s) e " + minDurac + " minuto(s)");
	}    
}
	
