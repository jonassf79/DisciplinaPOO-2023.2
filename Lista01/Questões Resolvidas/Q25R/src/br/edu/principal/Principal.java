package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalConv, custoTeatro, precoConv;
		
		System.out.print("Digite o preço dos custos do espetáculo teatral: ");
		custoTeatro = sc.nextDouble();
		System.out.print("Digite o preço do ingresso: ");
		precoConv = sc.nextDouble();
		
		totalConv = custoTeatro/precoConv;
		System.out.println("Para cobrir os custos do teatro, é necessário vender " + totalConv + " ingressos.");
	}
}
