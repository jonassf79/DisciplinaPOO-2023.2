package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double notaTrab, provSem, exameFin, media;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite a nota do trabalho de laboratório: ");
		notaTrab = sc.nextDouble();
		System.out.print("Digite a nota da prova semestral: ");
		provSem = sc.nextDouble();
		System.out.print("Digite a nota do exame final: ");
		exameFin = sc.nextDouble();
		
		System.out.println(" ");
		media = ((notaTrab * 2) + (provSem * 3) + (exameFin * 5)) / 10;
		System.out.println("Media ponderada: " + media);
		if(media >= 8 && media <= 10) {
			System.out.println("Obteve Conceito A");
		}
		else if(media >= 7 && media < 8) {
			System.out.println("Obteve Conceito B");
		}
		else if(media >= 6 && media < 7) {
			System.out.println("Obteve Conceito C");
		}
		else if(media >= 5 && media < 6) {
			System.out.println("Obteve Conceito D");
		}
		else {
			System.out.println("Obteve Conceito E");
		}
	}

}
