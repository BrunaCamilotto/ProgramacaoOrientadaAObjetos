package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dia = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o dia da semana(1-7): ");
		
		dia = teclado.nextInt();
		
		System.out.println("O dia é: " + dia);
		
		teclado.close();

	}

}
