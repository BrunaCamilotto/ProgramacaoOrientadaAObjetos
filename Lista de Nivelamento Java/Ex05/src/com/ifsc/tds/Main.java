package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner teclado = new Scanner(System.in);

		System.out.println("5 - Insira o nome: ");
		nome = teclado.nextLine();

		System.out.println("5 - Insira o sobrenome: ");
		sobrenome = teclado.nextLine();

		System.out.println("Seu nome é: " + nome + " " + sobrenome);
		
		teclado.close();

	}

}
