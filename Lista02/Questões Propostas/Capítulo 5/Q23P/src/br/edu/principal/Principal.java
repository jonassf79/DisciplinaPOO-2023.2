package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose, meses;
		double salario, novoSalario, ferias, decimoTerc;
		while(true) {
			System.out.println("==========MENU==========");
			System.out.print("[1] Novo Salário\n[2] Férias\n[3] Décimo Terceiro\n[4] Sair\n>");
			choose = sc.nextInt();
			if (choose == 1) {				
				System.out.print("\nDigite o seu salário (reais):" );
				salario = sc.nextDouble();
				if(210 >= salario) {
					novoSalario = salario + (salario * 0.15);
					System.out.println("O novo salário resulta em: " + novoSalario+ " reais\n");
				}
				else if(210 < salario & salario <= 600) {
					novoSalario = salario + (salario *(0.1));
					System.out.println("O novo salário resulta em: " + novoSalario+ " reais\n");
				}
				else {
					novoSalario = salario + (salario *(0.05));
					System.out.println("O novo salário resulta em: " + novoSalario+ " reais\n");
				}
			}
			else if(choose == 2) {
				System.out.print("\nDigite o seu salário (reais): " );
				salario = sc.nextDouble();
				ferias = salario + (salario/3);
				System.out.println("O valor do pagamento de suas férias é: " + ferias + " reais\n");
			}
			else if (choose == 3) {
				System.out.print("\nDigite o seu salário (reais): " );
				salario = sc.nextDouble();
				System.out.print("Digite a quantidade de meses trabalhadas (máximo: 12): ");
				meses = sc.nextInt();
				if(meses > 0 & meses <= 12) {
					decimoTerc = (salario * meses)/12; 
					System.out.println("O seu décimo terceiro resulta em: " + decimoTerc + " reais\n");
				}
				else {
					System.out.println("OBS: No máximo 12 meses");
					System.out.print("Digite a quantidade de meses trabalhadas: ");
					meses = sc.nextInt();
				}
			}
			else if(choose == 4) {
				System.out.println("Obrigado por utilizar");
				break;
			}
			else {
				System.out.println("OBS: Apenas valores apresentados no Menu\n");
			}
		}
	}

}
