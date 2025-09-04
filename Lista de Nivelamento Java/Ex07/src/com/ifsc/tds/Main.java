package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double celsius = 0, fahrenheit = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Insira o valor da temperatura em celsius: ");
		celsius = teclado.nextDouble();
		
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
	
		teclado.close();
	}

}
