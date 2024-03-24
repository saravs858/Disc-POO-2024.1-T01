package br.edu.principal;

/* QR17- Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse trabalhador emitiu dois cheques e agora deseja 
 * saber seu saldo atual. Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está 
 * zerado.*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor do salário obtido:");
	    double salario = sc.nextDouble();
	    System.out.println("Digite o valor do primeiro cheque:");
	    double cheque1 = sc.nextDouble();
	    System.out.println("Digite o valor do segundo cheque:");
	    double cheque2 = sc.nextDouble();
	    double cpmf1 = cheque1 * 0.38 / 100;
	    double cpmf2 = cheque2 * 0.38 / 100;
	    double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
	    System.out.println("O saldo bancário após a retirada dos cheques é de " + saldo);


	}

}
