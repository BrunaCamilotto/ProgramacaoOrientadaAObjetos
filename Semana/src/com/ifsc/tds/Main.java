package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dia = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o dia da semana: ");
		dia = teclado.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Invalido!");
			break;
		}

		teclado.close();
	}
	
}
