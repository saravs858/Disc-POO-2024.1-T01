package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
	
	 Scanner sc = new Scanner (System.in);
	  System.out.println("Quantos pés você deseja calcular? ");
	  int pés = sc.nextInt() ;
	  int polegadas = pés * 12;
	  int jarda = pés/3;
	  double milhas = jarda/1760;
	  
	  System.out.println("Seuu numero em pés era: "+ pés );
	  System.out.println("Em polegadas fica: "+ polegadas);
	  System.out.println("Em jarda fica: "+ jarda );
	  System.out.println("Em milhas fica: "+ milhas );
	}
}
