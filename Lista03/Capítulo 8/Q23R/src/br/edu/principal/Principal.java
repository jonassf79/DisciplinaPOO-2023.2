package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		  
			Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][4];
	        int[] vetor = new int[12];

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Digite o valor da matriz [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        gera_vetor(matriz, vetor);

	        System.out.println("\nO vetor gerado a partir da matriz é:");
	        for (int i = 0; i < 12; i++) {
	            System.out.println(vetor[i]);
	        }
	        
	    }

	    public static void gera_vetor(int[][] m, int[] v) {
	        int x = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                v[x] = m[i][j];
	                x++;
	            }
	        }

	}

}
