package br.edu.principal;
/*QP-20: Faça um programa que receba a medida do ângulo formado por uma escada apoiada no chão e a dis-
tância em que a escada está da parede, calcule e mostre a medida da escada para que se possa alcançar
sua ponta.**/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  	double angulo = 0;
	    System.out.println("Informe a medida do ângulo formado entre a distância da ponta da escada ao chão:");
	    angulo = sc.nextDouble();

	    double distancia, medEscada;
	    System.out.println("Informe a medida da distância da escada a parede em metros:");
	    distancia = sc.nextDouble();
	    double angRad = Math.toRadians(angulo);
	medEscada = distancia / Math.sin(angRad);
	    System.out.println("A medida da escada é: " + medEscada);

	}

}
