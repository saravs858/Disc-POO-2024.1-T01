package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i;
		float f, a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float num = sc.nextFloat();
		
		i = (int)num;
		a = Math.round(num);
		f = num - i;
		
		System.out.println("O inteiro do número é: " + i);
		System.out.print("O valor fracionario do numero é: ");
		System.out.printf("%.1f \n", f);
		System.out.println("O valor arredondado do numero é: " + a);
	}

}
