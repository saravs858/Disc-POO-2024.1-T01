package br.edu.principal;

/** QR10-"Fa�a um programa que calcule e mostre a �rea de um c�rculo. Sabe-se que: �rea = p * R2" **/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   int raio = 0;
		   System.out.println("Defina o valor do raio da seu c�rculo: ");
		    raio = sc.nextInt();
		    double pi = 3.14;
		    double areac = pi *(raio * 2);
		    System.out.println("A �rea do seu c�rculo �: " + areac);

	}

}
