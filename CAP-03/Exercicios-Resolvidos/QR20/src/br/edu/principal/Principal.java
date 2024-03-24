package br.edu.principal;
/* QR20 - Faça um programa que receba a medida do ângulo (em graus) formado por uma escada apoiada no chão e encostada na 
 * parede e a altura da parede onde está a ponta da escada. Calcule e mostre a medida dessa escada. Observação: as funções 
 * trigonométricas implementadas nas linguagens de programação trabalham com medidas de ângulos em radianos.*	/
 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Insira o angulo da escada entre o chão e a parede (em graus):");
        double angulo = sc.nextDouble();
        System.out.println("Insira a altura da parede (em metros):");
        double altura = sc.nextDouble();
        double radiano = angulo * 3.14 / 180;
        double escada = altura / radiano;
        System.out.println("O tamanho da escada é de " + escada + " metros");


	}

}
