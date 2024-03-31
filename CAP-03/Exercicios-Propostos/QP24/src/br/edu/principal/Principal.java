package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double d, ma, le;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quanto dinheiro você planeja levar: ");
		float rs = sc.nextFloat();
		
		d = rs / 1.80;
		ma = rs / 2;
		le = rs / 3.57;
		
		System.out.print("O seu dinheiro em dolar equivale a: ");
		System.out.printf("%.2f \n", d);
		System.out.print("O seu dinheiro em marco alemão equivale a: ");
		System.out.printf("%.2f \n", ma);
		System.out.print("O seu dinheiro em libras esterlinas equivale a: ");
		System.out.printf("%.2f \n", le);
	}

}
