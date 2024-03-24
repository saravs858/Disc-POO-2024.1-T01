package br.edu.principal;
/* QR16- Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber, seguindo estas regras: 
 * a) a hora trabalhada vale a metade do salário mínimo. 
 * b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
 * c) o imposto equivale a 3% do salário bruto. 
 * d) o salário a receber equivale ao salário bruto menos o imposto.*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de horas trabalhadas:");
		double horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Qual o valor do salário minimo?");
		double salarioMinimo = sc.nextFloat();

		double valorDaHoraTrabalhada = salarioMinimo/2;
		double salarioBruto = horasTrabalhadas * valorDaHoraTrabalhada;
		double imposto = salarioBruto * 0.03;
		double salarioRecebido = salarioBruto - imposto;

		System.out.println("O valor do salário bruto é " + salarioBruto + " reais" + "\n" + "O valor do imposto é " + imposto + " reais" + "\n" + "O valor do salário recebido é " + salarioRecebido + " reais");

	

	}

}
