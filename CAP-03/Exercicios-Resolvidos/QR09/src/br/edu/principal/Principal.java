package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int base, altura;
    
    System.out.println("Digite a base do seu tri�ngulo:");
    base = sc.nextInt();
    
    System.out.println("Digite a altura do seu tri�ngulo:");
    altura = sc.nextInt();
    
    System.out.println(" A �rea dos eu tri�ngulo �:" + (base * altura /2));
    
	 }
	 
}

