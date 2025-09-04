package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int primeiroNumero = 0, segundoNumero = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		primeiroNumero = teclado.nextInt();

		System.out.println("Insira o segundo numero: ");
		segundoNumero = teclado.nextInt();

		resultado = primeiroNumero + segundoNumero;

		System.out.println("Resultado é: " + resultado);

		teclado.close();
	}

}
