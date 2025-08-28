package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double peso = 0, altura = 0, imc = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Insira seu peso por gentileza: ");
		peso = teclado.nextDouble();
		
		System.out.println("2 - Agora insira sua altura: ");
		altura = teclado.nextDouble();
		
		imc = (peso / (altura * 2))  ; 
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso! IMC: " + imc);
		}else if(imc >= 18.5 && imc <= 24.99) {
			System.out.println("Você está com peso normal! IMC: " + imc);
		}else {
			System.out.println("Você esta acima do peso! IMC: " + imc);
		}
		
		teclado.close();
	}

}
