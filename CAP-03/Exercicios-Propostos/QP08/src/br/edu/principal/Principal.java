package br.edu.principal;

// QR08- "Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		  double dep, taxa = 0;
		  
		  System.out.println("Digite o valor do depósito:");
		  dep = sc.nextDouble();
		  
		  System.out.println("Digite o valor da taxa:");
		  taxa = sc.nextDouble();
		
		  double rend = dep * taxa/100;
		  System.out.println("O valor do rendimento é: " + rend);
		  
		  double total = dep + rend;
		  System.out.println("O valor total foi de: " + total);
	}

}
