package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double total = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i < 20; i++) {
			
			System.out.println("Insira o valor do " + i + "° item");
			total = total + teclado.nextDouble();
			
		}
		
		System.out.println("Total a pagar é: R$" + total);
		
		teclado.close();
		
	}

}
