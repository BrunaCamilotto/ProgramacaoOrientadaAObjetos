package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double distancia = 0, combustivel = 0, consumo = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira a distancia percorrida(km): ");
		distancia = teclado.nextDouble();

		System.out.println("Insira o total de combustivel gasto(litros): ");
		combustivel = teclado.nextDouble();

		consumo = distancia / combustivel;

		System.out.printf("O consumo médio é de: " + consumo + " L");

		teclado.close();

	}

}
