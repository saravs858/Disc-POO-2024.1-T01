package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	      System.out.println("Insira o seu peso em kg:");
	      double peso = sc.nextDouble();
	      double maispeso = peso * 1.15;
	      double menospeso = peso * 0.80;
	      System.out.println("se você engordasse 15% do seu peso, você pesaria " + maispeso + "kg");
	      System.out.println("se você emagresse 20% do seu peso, você pesaria " + menospeso + "kg");


	}

}
