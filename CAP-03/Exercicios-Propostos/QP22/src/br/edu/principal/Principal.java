package br.edu.principal;

import java.util.Scanner;

/**Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número
de diagonais desse polígono. Sabe-se que ND = N * (N − 3)/2, em que N é o número de lados do
polígono. **/

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int lados, diagonais;
		
		System.out.println("Informe a quantidade de lados do polígono convexo:");
		lados = sc.nextInt();
		
		diagonais = lados * (lados - 3)/2;
		
		System.out.printf("A quantidade de diagonais desses polígono é " + diagonais);

	}

}
