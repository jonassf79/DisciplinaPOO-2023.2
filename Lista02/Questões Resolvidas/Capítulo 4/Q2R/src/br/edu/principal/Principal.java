package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media, notaUm, notaDois, notaTres, notaAposExame;
		
		System.out.print("Digite a primeira nota: ");
		notaUm = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		notaDois = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		notaTres = sc.nextDouble();
		
		System.out.println(" ");
		media = (notaUm + notaDois + notaTres)/3;
		System.out.println("A média resultou em: " + media);
		
		if(media <= 10 && media >= 7){
			System.out.println("Aprovado");
		}
		else if(media < 7 && media >=3){
			System.out.println("O aluno deverá ir para o exame final");
			notaAposExame = 12 - media;
			System.out.println("Deve tirar " + notaAposExame + " para ser aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		}

}
