package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] vetorNotas = new double[3];
		double somaNotas = 0, mediaNotas = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < vetorNotas.length; i++) {

			System.out.println("Digite a nota: ");
			vetorNotas[i] = teclado.nextDouble();
		}

		for (double nota : vetorNotas) {
			somaNotas = somaNotas + nota;
		}

		mediaNotas = somaNotas / vetorNotas.length;

		System.out.println("A media das notas é: " + mediaNotas);

		teclado.close();

	}

}
