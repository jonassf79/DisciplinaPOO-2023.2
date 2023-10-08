package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numb, ptInt, ptFrac, numArrend;
		
		System.out.print("Digite qualquer número real: ");
		numb = sc.nextDouble();
		
		ptInt = (int)numb;
		ptFrac = numb - ptInt;
		numArrend = Math.round(numb);
		
		System.out.println("A parte inteira do número digitado é: " + ptInt);
		System.out.println("A parte fracionária do número digitado é: " + ptFrac);
		System.out.println("O número digitado na sua forma arredondada é: " + numArrend );

	}

}
