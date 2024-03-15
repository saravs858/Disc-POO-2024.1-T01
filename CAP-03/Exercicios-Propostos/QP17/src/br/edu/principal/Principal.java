package br.edu.principal;

import java.util.Scanner;

/** Faça um programa que receba o raio, calcule e mostre:
a) o comprimento de uma esfera; sabe-se que C = 2 * p R;
b) a área de uma esfera; sabe-se que A = p R2;
c) o volume de uma esfera; sabe-se que V = 3⁄4 * p R3. **/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double raio, comp, area, vol;
		double pi = 3.1415;
		
		System.out.println("Informe o raio da esfera:");
		raio = sc.nextDouble();
		
		comp = 2*pi*raio;
		area = pi * Math.pow(raio, 2);
		vol = (4 * pi * Math.pow(raio, 3))/3; 
		
		System.out.printf("O comprimento da circunferência é %.2f %n", comp);
		System.out.printf("A área do círculo é %.2f %n", area);
		System.out.printf("O volume da esfera é %.2f %n", vol);
		
			
		
	}

}
