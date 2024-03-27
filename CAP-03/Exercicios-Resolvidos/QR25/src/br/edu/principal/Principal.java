package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float qtd;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o custo para realizar o espetaculo: ");
		float custo = sc.nextFloat();
		System.out.print("Digite o valor do convite: ");
		float convite = sc.nextFloat();
		
		qtd = custo / convite;
		System.out.print("A quantidade de convites que devem ser vendidos é: " + qtd);
		
		}

}
