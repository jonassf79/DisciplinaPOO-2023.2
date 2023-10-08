package br.edu.principal;

public class Principal {
	 public static void main(String[] args) {
	        double salarioJoao = 1000.0;
	        double conta1 = 200.0;
	        double conta2 = 300.0;
	        double multa = 0.02;

	        double multaConta1 = conta1 * multa;
	        double multaConta2 = conta2 * multa;

	        double totalAPagar = conta1 + multaConta1 + conta2 + multaConta2;

	        double saldoRestante = salarioJoao - totalAPagar;

	        System.out.println("Salário de João: R$" + salarioJoao);
	        System.out.println("Conta 1: R$" + conta1);
	        System.out.println("Multa da Conta 1: R$" + multaConta1);
	        System.out.println("Conta 2: R$" + conta2);
	        System.out.println("Multa da Conta 2: R$" + multaConta2);
	        System.out.println("Total a pagar: R$" + totalAPagar);
	        System.out.println("Saldo restante: R$" + saldoRestante);
	    }
}
