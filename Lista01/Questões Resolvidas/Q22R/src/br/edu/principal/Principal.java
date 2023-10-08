package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double quillo, valorSal, valorQuillo, valorReais, desc , valorDesc;
		
		System.out.print("Digite o valor do salário: ");
		valorSal = sc.nextDouble();
		System.out.print("Digite a quantidade de quillowatts consumida pela residência: ");
		quillo = sc.nextDouble();
		
		valorQuillo = valorSal / 5;
		valorReais = valorQuillo * quillo;
		desc = valorReais * (0.15);
		valorDesc = valorReais - desc;
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("O valor do Quillowatt é: " + valorQuillo + " reais");
		System.out.println("O valor total de quillowatts gasto pela residência é de: " + valorReais + " reais");
		System.out.println("O valor total com desconto de 15% é de: " + valorDesc + " reais");
	}
}
