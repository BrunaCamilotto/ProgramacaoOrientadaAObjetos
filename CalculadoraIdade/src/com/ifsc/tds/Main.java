package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idade = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Insira a idade a ser consultada, por gentileza: ");
		idade = teclado.nextInt();
		
		if(idade > 18){
			System.out.println("É maior de idade!");
			
		}else{
			System.out.println("É menor de idade!");
		}
		
		teclado.close();
	}

}
