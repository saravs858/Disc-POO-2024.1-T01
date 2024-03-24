package br.edu.principal;
/* QR19 - Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o usuário deseja alcançar 
 * subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura 
 * do usuário. Todas as medidas fornecidas devem estar em metros.
 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho de cada degrau da escada (em metros):");
        double degrau = sc.nextDouble();
        System.out.println("Insira a altura que deseja alcançar (em metros):");
        double altura = sc.nextDouble(); 
        double totalDegraus = altura / degrau;
        System.out.println("Você precisará subir " + totalDegraus + " degraus para alcançar a altura desejada");


	}

}
