package br.edu.principal;

/** QR07-Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber,
sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base."
*/

import java.util.Scanner;

public class Principal {
	
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        int sal = 0;
	        System.out.println("Informe o seu sálario: ");
	        sal = sc.nextInt();
	        int imp = sal - sal * 10 / 100;
	        int grat = imp + 50;
	        System.out.printf("O seu sálario é: %.2f %n " , grat);
	        

	  }
	  
}