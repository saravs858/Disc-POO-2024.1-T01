package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float m, conversao;
		int h;
		
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
			conversao = (h*60) + (m*100);
			System.out.print("A hora digitada em minutos é: " + conversao);
		}
	}

}
