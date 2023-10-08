package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horaTrab , salMin, vlrHoraTrab, salBruto, impost, salLiq;
		
		System.out.print("Digite o valor do salário mínimo: ");
		salMin = sc.nextDouble();
		
		System.out.print("Digite as horas de trabalho: ");
		horaTrab = sc.nextDouble();
		
		vlrHoraTrab = salMin / 2;
		salBruto = vlrHoraTrab * horaTrab;
		impost = salBruto * 0.03;
		salLiq = salBruto - impost;
		System.out.println("O valor do salário líquido resulta em: " + salLiq + " reais");
	};

}
