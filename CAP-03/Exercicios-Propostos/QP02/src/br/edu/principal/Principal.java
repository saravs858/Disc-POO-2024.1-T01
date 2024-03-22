package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2= sc.nextInt();
        int resultado = n1*n2;
        System.out.println("O resultado da multiplicação é: " + resultado);
	
	}

}
