package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double area = 0, raio = 0;
		double pi = 3.14159;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Insira o valor do raio:");
		raio = teclado.nextDouble();
		
		area = pi * (raio * raio) ;
		
		System.out.println("Área é: " + area);
		
		teclado.close();

	}

}
