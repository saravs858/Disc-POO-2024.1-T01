package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float h, m, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora: ");
		float hora = sc.nextFloat();
		
		h = (int)hora;
		m = hora - h;
		
		if (h > 24) {
			System.out.print("Hora inexistente.");
		}
		else if (m > 0.60) {
			System.out.print("Minutos inexistentes.");
		}
		else {
			h = h*60;
			m = h + (m * 100);
			System.out.print("A hora em minutos é: ");
			System.out.printf("%.2f \n",h);
			System.out.print("O total de minutos é: ");
			System.out.printf("%.2f \n",m);
			total = m * 100;
			System.out.print("A hora em segundos é: ");
			System.out.printf("%.2f \n",total);
		}
	}

}
