package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Em que ano você nasceu?");
		int AnoNascimento= sc.nextInt();
		System.out.println("O ano que você nasceu foi: " + AnoNascimento + ("\n\n"));
		
		System.out.println("Digite o seu ano atual: ");
		int AnoAtual= sc.nextInt();
		System.out.println("O ano atual é: " + AnoAtual + ("\n"));
		
		int idade = AnoAtual - AnoNascimento;
		System.out.println("Sua idade é " + idade + ("\n"));
		
		int AnoEspecifico = 2050 ;
		int idade2050 = AnoEspecifico - AnoNascimento;
		System.out.println("Em 2050 você terá: " + idade2050 );
		
	}

}
