package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int primeiroNumero = 0, segundoNumero = 0, terceiroNumero = 0, variavel = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Insira o primeiro numero: ");
		primeiroNumero = teclado.nextInt();
		
		System.out.println("2  - Insira o segundo numero");
		segundoNumero = teclado.nextInt();

		System.out.println("3  - Insira o terceiro numero");
		terceiroNumero = teclado.nextInt();
		
		
		if(primeiroNumero > segundoNumero) {
			variavel = primeiroNumero;
		}else{
			variavel = segundoNumero;
		}
		
		if(variavel > terceiroNumero) {	
			System.out.println("O maior é: " + variavel);
		}else {
			System.out.println("O maior é: " + terceiroNumero);
		}
	
		teclado.close();
	}

}
