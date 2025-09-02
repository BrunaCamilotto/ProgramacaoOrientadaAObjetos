package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double base = 0, expoente = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Insira o valor da base:");
		base = teclado.nextDouble();
		
		System.out.println("2 - Insira o valor do expoente:");
		expoente = teclado.nextDouble();
		
		resultado = Math.pow(base, expoente);
		
		System.out.println("Área é: " + resultado);
		
		teclado.close();

	}

}
