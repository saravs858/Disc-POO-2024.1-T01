package br.edu.principal;

/** QR06- "Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% também sobre o salário base."
*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		    int sal = 0;
		    
		    System.out.println("Informe o seu sálario: ");
		    sal = sc.nextInt();
		    
		    int grat = sal + sal * 5 / 100;
		    int imp = grat - grat * 7 / 100;
		    
		    System.out.printf("O seu salário é: %.2f %n" , imp);
		   

	}

}
