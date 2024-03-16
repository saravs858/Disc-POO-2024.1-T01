package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o preço de fabrica: ");
	int pFab =sc.nextInt();
	System.out.println("Digite o percentual de lucro do distribuidor: ");
	int percD = sc.nextInt();
	System.out.println("Digite o percentual dos impostos: ");
	int percI = sc.nextInt();
	int valorDistribuidor = pFab * percD/100;
	int valorImpostos = pFab * percI/100;
	int pFinal = pFab+valorDistribuidor+valorImpostos;
	
	System.out.println("O valor do Distribuidor foi: " + valorDistribuidor);
	System.out.println("O valor dos impostos foi: " + valorImpostos);
	System.out.println("O valor final foi de : " + pFinal);
	
	}

}
