package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero = 0;
		int menor = 0;
		int contador = 0;

		Scanner teclado = new Scanner(System.in);

		while (contador < 3) {
			System.out.println("Digite o número: ");
			numero = teclado.nextInt();

			if (contador == 0) {
				menor = numero;
			} else {
				if (numero < menor) {
					menor = numero;
				}
			}
			contador++;
		}

		System.out.println("O menor numero é: " + menor);
		teclado.close();
	}

}
