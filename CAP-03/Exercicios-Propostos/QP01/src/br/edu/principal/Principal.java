package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		System.out.println("Digite o primeiro numero: ");
		n1= sc.nextInt();
		int n2= 0;
		System.out.println("Digite o segundo numero: ");
		n1= sc.nextInt();
        int resultado = (n1-n2);
        System.out.println("O resultado da subtração é: " + resultado);
	}

}
