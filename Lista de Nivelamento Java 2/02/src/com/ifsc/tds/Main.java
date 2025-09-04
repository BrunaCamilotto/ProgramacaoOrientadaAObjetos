package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, notaFinal = 0, notaRecuperacao;
		Scanner teclado = new Scanner(System.in);

		System.out.println("1 - Insira a primeira nota: ");
		nota1 = teclado.nextDouble();

		System.out.println("2 - Insira a segunda nota: ");
		nota2 = teclado.nextDouble();

		System.out.println("3 - Insira a terceira nota: ");
		nota3 = teclado.nextDouble();

		System.out.println("4 - Insira a quarta nota: ");
		nota4 = teclado.nextDouble();

		notaFinal = ((nota1 + nota2 + nota3 + nota4) / 4);

		if (notaFinal >= 7) {
			System.out.println("Parabens! Voce passou com nota: " + notaFinal);
		} else if (notaFinal < 7 && notaFinal >= 2) {
			System.out.println("Ficou de Recuperação!");
			System.out.println("Insira nota de recuperação: ");
			notaRecuperacao = teclado.nextDouble();
			notaFinal = notaFinal + notaRecuperacao / 4;

			if (notaFinal >= 5) {
				System.out.println("Parabens! Voce passou com nota: " + notaFinal);
			} else {
				System.out.println("Ah não! Você bombou, que vergonha! Nota: " + notaFinal);
			}

		} else {
			System.out.println("Ah não! Você bombou, que vergonha! Nota: " + notaFinal);
		}

		teclado.close();
	}

}
