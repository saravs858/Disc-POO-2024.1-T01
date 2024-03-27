package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double y;
		
		System.out.print("Digite a altura em que deseja pregar o quadro: ");
		double x = sc.nextDouble();
		System.out.print("Digite o tamanho da escada: ");
		double z = sc.nextDouble();
		
		y = (z*z)-(x*x);
		if (z < x) {
			System.out.println("O tamanho da escada deve ser maior que a altura que deseja alcançar.");
		}
		else {
			y = Math.sqrt(y);
			System.out.print("A escada deverá ficar a ");
			System.out.printf("%.2f", y);
			System.out.print(" metros de distancia.");
		}

	}

}
