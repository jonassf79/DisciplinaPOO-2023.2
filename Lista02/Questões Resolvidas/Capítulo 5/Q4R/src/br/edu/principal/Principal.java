package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int cont, cod, numVei, numAcid, maior = 0, cidMaior = 0, menor = 0, cidMenor = 0;
        double mediaVei, somaVei = 0, mediaAcid = 0;
        int somaAcid = 0, contAcid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.print("\nDigite o código da cidade: ");
            cod = sc.nextInt();
            System.out.print("Digite o número de veículos: ");
            numVei = sc.nextInt();
            System.out.print("Digite o número de acidentes: ");
            numAcid = sc.nextInt();

            if (cont == 1) {
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
                cidMenor = cod;
            } 
            else {
                if (numAcid > maior) {
                    maior = numAcid;
                    cidMaior = cod;
                }
                if (numAcid < menor) {
                    menor = numAcid;
                    cidMenor = cod;
                }
            }

            somaVei += numVei;

            if (numVei < 2000) {
                somaAcid += numAcid;
                contAcid++;
            }
        }

        System.out.println("\nCidade com o maior número de acidentes: " + cidMaior);
        System.out.println("Cidade com o menor número de acidentes: " + cidMenor);

        mediaVei = somaVei / 5;
        System.out.println("Média de veículos nas cidades: " + mediaVei);

        if (contAcid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } 
        else {
            mediaAcid = (double) somaAcid / contAcid;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcid);
        }

	}

}
