package br.edu.principal;

//Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		int n1, n2,n3,n4; 
		
		System.out.println("Digite o primeiro número inteiro:");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número inteiro:");
		n3 = sc.nextInt();
		System.out.println("Digite o quarto número inteiro:");
		n4 = sc.nextInt();
		
		int resul = (n1 + n2 + n3 + n4);
		
		
		System.out.println("A soma dos valores é igual a " + resul);
	}

}
