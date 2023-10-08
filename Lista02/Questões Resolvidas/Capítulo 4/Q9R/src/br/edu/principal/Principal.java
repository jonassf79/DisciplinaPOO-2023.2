package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, hora, min;
		String nomeMes;
		
		System.out.print("Digite o dia: ");
		dia = sc.nextInt();
		System.out.print("Digite o número do mês: ");
		mes = sc.nextInt();
		System.out.print("Digite o ano: ");
		ano = sc.nextInt();
		
		System.out.println("\nData atual: " + dia + "/" + mes + "/" + ano);
		
		if(mes == 1) {
			nomeMes = "janeiro";
			System.out.println(nomeMes);
		}
		else if(mes == 2) {
			nomeMes = "fevereiro";
			System.out.println(nomeMes);
		}
		else if(mes == 3) {
			nomeMes = "março";
			System.out.println(nomeMes);
		}
		else if(mes == 4) {
			nomeMes = "abril";
			System.out.println(nomeMes);
		}
		else if(mes == 5) {
			nomeMes = "maio";
			System.out.println(nomeMes);
		}
		else if(mes == 6) {
			nomeMes = "junho";
			System.out.println(nomeMes);
		}
		else if(mes == 7) {
			nomeMes = "julho";
			System.out.println(nomeMes);
		}
		else if(mes == 8) {
			nomeMes = "agosto";
			System.out.println(nomeMes);
		}
		else if(mes == 9) {
			nomeMes = "setembro";
			System.out.println(nomeMes);
		}
		else if(mes == 10) {
			nomeMes = "outubro";
			System.out.println(nomeMes);
		}
		else if(mes == 11) {
			nomeMes = "novembro";
			System.out.println(nomeMes);
		}
		else if(mes == 12) {
			nomeMes = "dezembro";
			System.out.println(nomeMes);
		}
		
		System.out.print("Digite as horas:");
		hora = sc.nextInt();
		System.out.print("Digite os minutos:");
		min = sc.nextInt();
		System.out.print("\nHora atual: " + hora + ":" + min);
	}

}
