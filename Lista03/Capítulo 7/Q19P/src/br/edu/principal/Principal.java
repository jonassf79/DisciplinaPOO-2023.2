package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[8][6];

        preencherMatriz(matriz);

        calcularMediaLinhasPares(matriz);
    }

    public static void preencherMatriz(int[][] matriz) {
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
    }

    public static void calcularMediaLinhasPares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                int soma = 0;
                int contador = 0;

                for (int j = 0; j < matriz[0].length; j++) {
                    soma += matriz[i][j];
                    contador++;
                }

                double media = (double) soma / contador;
                System.out.println("Média da linha " + i + ": " + media);
            }
        }
    }
}

