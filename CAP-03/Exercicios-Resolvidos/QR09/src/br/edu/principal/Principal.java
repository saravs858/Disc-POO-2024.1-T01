package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int base, altura;
    
    System.out.println("Digite a base do seu triângulo:");
    base = sc.nextInt();
    
    System.out.println("Digite a altura do seu triângulo:");
    altura = sc.nextInt();
    
    System.out.println(" A área dos eu triângulo é:" + (base * altura /2));
    
	 }
	 
}

