package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vlr_kw, vlr_rs, desc, vlr_desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario minimo: ");
		double vlr_sal = sc.nextDouble();
		System.out.print("Digite a quantidade de quilowatts consumida pela residencia: ");
		double qtd_kw = sc.nextDouble();
		
		vlr_kw = vlr_sal/5;
		vlr_rs = vlr_kw * qtd_kw;
		desc = (vlr_rs*15)/100;
		vlr_desc = vlr_rs - desc;
		
		System.out.println("O valor de cada quilowatt é: " + vlr_kw);
		System.out.println("O valor a ser pago pela residencia é: " + vlr_rs);
		System.out.println("O valor a ser pago com descnto é: " + vlr_desc);
		
	}

}
