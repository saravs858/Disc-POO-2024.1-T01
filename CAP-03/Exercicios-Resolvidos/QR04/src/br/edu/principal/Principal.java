package br.edu.principal;
//Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		double salario;
		
		System.out.println("Informe seu salário atual:");
		salario = sc.nextDouble();
		
		double novsal = salario + (salario * 25/100);
		
		System.out.printf("O novo salário será %.2f %n", novsal);
	}

}
