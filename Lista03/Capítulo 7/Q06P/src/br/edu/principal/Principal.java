package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[20][10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        int[] somaColunas = new int[10];
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 20; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] *= somaColunas[j];
            }
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


