package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro numero: ");
	double num1 = sc.nextDouble();
	System.out.println("Digite o segundo numero: ");
	double num2 = sc.nextDouble();
	
	double r1 = Math.pow(num1, num2);
	System.out.println("O resultado do primeiro numero elevado ao segundo é: " + r1);
	 
	double r2 = Math.pow(num2, num1);
	System.out.println("O resultado do segundo numero elevado ao primeiro é: " + r2);

	}

}
