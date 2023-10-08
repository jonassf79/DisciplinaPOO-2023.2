package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		  int[] vetor = new int[3];
	        perfeitos(vetor);

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Número perfeito " + (i + 1) + ": " + vetor[i]);
	        }
	    }

	    public static void perfeitos(int[] v) {
	        int num = 1;
	        int cont = 0;

	        while (cont < 3) {
	            int soma = 0;

	            for (int a = 1; a < num; a++) {
	                if (num % a == 0) {
	                    soma += a;
	                }
	            }

	            if (soma == num) {
	                v[cont] = num;
	                cont++;
	            }

	            num++;
	        }
		
	}

}
