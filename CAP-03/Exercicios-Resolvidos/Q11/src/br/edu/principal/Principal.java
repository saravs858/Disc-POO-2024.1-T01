package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite um valor inteiro: ");
	int valor = sc.nextInt();
	int quadrado = valor*valor;
	System.out.println(" Esse numero elevado a 2 é: " + quadrado);
	int cubo = valor*valor*valor;
	System.out.println(" Esse numero elevado a 3 é: " + cubo);

	double r2 = Math.sqrt(valor);
	System.out.println("A raiz quadrada do numero: " + valor + " É igual a: " + r2);
	double r3 = Math.cbrt(valor);
	System.out.println("A raiz cúbica do numero: " + valor + " É igual a: " + r3);

	}

}
