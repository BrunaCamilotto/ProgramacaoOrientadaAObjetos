package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salario = 0, emprestimo = 0, valorParcelas = 0;
		int parcelas = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o valor do emprestimo solicitado: ");
		emprestimo = teclado.nextDouble();

		System.out.println("Insira em quantas parcelas deseja pagar: ");
		parcelas = teclado.nextInt();

		System.out.println("Insira qual o salario do contribuinte: ");
		salario = teclado.nextDouble();

		valorParcelas = emprestimo / parcelas;

		if (salario * 0.3 <= valorParcelas) {

			System.out.println("valor das parcelas: " + valorParcelas);
			System.out.println("Negado!");

		} else {

			System.out.println("valor das parcelas: " + valorParcelas);
			System.out.println("Aprovado!");

		}

		
		teclado.close(); 
	}

}
