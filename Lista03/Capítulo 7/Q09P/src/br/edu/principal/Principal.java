package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];

        preencherMatriz(matriz);

        calcularSomasColunas(matriz);

        mostrarSomasColunas(matriz);
    }

    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void calcularSomasColunas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[6][j] = 0;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[6][j] += matriz[i][j];
            }
        }
    }

    public static void mostrarSomasColunas(int[][] matriz) {
        System.out.println("Somas das Colunas:");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + matriz[6][j]);
        }
    }
}

