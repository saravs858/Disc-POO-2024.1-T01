package br.edu.principal;

/** QR06- "Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de 5% sobre o sal�rio base e paga imposto de 7% tamb�m sobre o sal�rio base."
*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		    int sal = 0;
		    
		    System.out.println("Informe o seu s�lario: ");
		    sal = sc.nextInt();
		    
		    int grat = sal + sal * 5 / 100;
		    int imp = grat - grat * 7 / 100;
		    
		    System.out.printf("O seu sal�rio �: %.2f %n" , imp);
		   

	}

}
