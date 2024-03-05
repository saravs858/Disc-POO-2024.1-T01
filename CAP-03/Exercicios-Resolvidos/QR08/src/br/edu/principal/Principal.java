package br.edu.principal;
/** QR08-"Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento."
**/

import java.util.Scanner;


public class Principal {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int dep, taxa = 0;
		  System.out.println("Digite o valor do depósito:");
		  dep = sc.nextInt();
		  System.out.println("Digite o valor da taxa:");
		  taxa = sc.nextInt();
		  double rend = dep * taxa/100;
		  System.out.printf("O valor do rendimento é: %.2f %n" ,
		  rend);
		  double total = dep + rend;
		  System.out.printf("O valor total foi de: %.2f %n " , total);
		     
		  }
}
