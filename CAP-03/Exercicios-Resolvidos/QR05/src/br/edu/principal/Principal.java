package br.edu.principal;
//Fa�a um programa que receba o sal�rio de um funcion�rio e o percentual de aumento, calcule e mostre o valor do aumento e o novo sal�rio.

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		double salario, perc;
		
		System.out.println("Informe seu sal�rio atual:");
		salario = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento:");
		perc = sc.nextDouble();
		
		double aumento = salario * perc/100;
		double novsal = salario + aumento;
		
		System.out.printf("O aumento ser� de %.2f %n",aumento);
		System.out.printf( "O novo sal�rio ser� %.2f %n", novsal);
	}

}