package br.edu.principal;

/** QR10-"Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = p * R2" **/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   int raio = 0;
		   System.out.println("Defina o valor do raio da seu círculo: ");
		    raio = sc.nextInt();
		    double pi = 3.14;
		    double areac = pi *(raio * 2);
		    System.out.println("A área do seu círculo é: " + areac);

	}

}
