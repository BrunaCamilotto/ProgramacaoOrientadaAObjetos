package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double comprimento = 0, largura = 0, altura = 0, volume = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o comprimento: ");
		comprimento = teclado.nextDouble();
	
		System.out.println("Insira a largura: ");
		largura = teclado.nextDouble();
	
		System.out.println("Insira a altura: ");
		altura = teclado.nextDouble();
	
		volume = comprimento * largura * altura;
		
		System.out.println("O volume da caixa retangular é:" + volume);
		
		teclado.close();
		
	
	
	}

}
