package br.edu.principal;
//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		double salario, perc;
		
		System.out.println("Informe seu salário atual:");
		salario = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento:");
		perc = sc.nextDouble();
		
		double aumento = salario * perc/100;
		double novsal = salario + aumento;
		
		System.out.printf("O aumento será de %.2f %n",aumento);
		System.out.printf( "O novo salário será %.2f %n", novsal);
	}

}