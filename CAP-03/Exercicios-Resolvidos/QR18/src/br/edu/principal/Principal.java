package br.edu.principal;
/*QR18 - Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a quantidade de ração em 
 * gramas. A quantidade diária de ração fornecida para cada gato é sempre a mesma. Faça um programa que receba o peso do 
 * saco de ração e a quantidade de ração fornecida para cada gato, calcule e mostre quanto restará de ração no saco após cinco 
 * dias.*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso do saco de ração (em kg):");
        double peso_saco = sc.nextDouble();
        System.out.println("Digite o quanto de ração o primeiro gato comeu por dia (em gramas):");
        double primeiro_gato = sc.nextDouble();
        System.out.println("Digite o quanto de ração o segundo gato comeu por dia (em gramas):");
        double segundo_gato = sc.nextDouble();
        double saldo = peso_saco - 5 * (primeiro_gato / 1000 + segundo_gato / 1000);
        System.out.println("o peso final do saco ao fim de 5 dias é " + saldo +"kg");


	}

}
