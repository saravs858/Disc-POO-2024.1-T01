package br.edu.principal;
//Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		double nota1,nota2,nota3;
		double peso1, peso2, peso3;
		
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Qual o peso da primeira nota:");
		peso1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextDouble();
		System.out.println("Qual o peso da segunda nota:");
		peso2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		nota3 = sc.nextDouble();
		System.out.println("Qual o peso da terceira nota:");
		peso3 = sc.nextDouble();
		
		double mediaPon = (nota1 * peso1 + nota2 * peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		
		System.out.printf("A média ponderada entre as três notas é %.2f %n", mediaPon);
		
	}
}	