package br.edu.principal;

/** QR07-Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre seu sal�rio a receber,
sabendo-se que o funcion�rio tem gratifica��o de R$ 50 e paga imposto de 10% sobre o sal�rio base."
*/

import java.util.Scanner;

public class Principal {
	
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        int sal = 0;
	        System.out.println("Informe o seu s�lario: ");
	        sal = sc.nextInt();
	        int imp = sal - sal * 10 / 100;
	        int grat = imp + 50;
	        System.out.printf("O seu s�lario �: %.2f %n " , grat);
	        

	  }
	  
}