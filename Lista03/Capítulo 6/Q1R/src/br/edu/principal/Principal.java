package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int array[] = new int[9]; 
		int i, j, cont;
		
		for(int x = 0; x < array.length; x++) {
			array[x] = x;
		}
		for(i = 0; i < array.length; i++) {
			cont = 0;
			for (j = 1; j < array.length; j++) {
				if(array[i]%j==0) {
					cont++;
				}
			}
			if(cont==2) {
				System.out.println("O número primo na posição " + array[i] +  " é: " + i);
			}
		}
		
	}

}
