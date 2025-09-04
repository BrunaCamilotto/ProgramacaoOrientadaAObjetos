package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tempo = 0, velocidade = 0, distancia = 0, litros = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o tempo gasto na viagem (horas): ");
		tempo = teclado.nextDouble();

		System.out.println("Insira a velocidade média na viagem (km/h): ");
		velocidade = teclado.nextDouble();
		
		distancia = tempo * velocidade;
		litros = distancia / 12;
		
		
		System.out.printf("Velocidade media: " + velocidade + "km/h\n");
		System.out.printf("Tempo gasto: " + tempo + "horas\n");
		System.out.printf("Distancia percorrida: " + distancia + "km\n");
		System.out.printf("Litros utilizados:  " + litros + "L\n");
		
		teclado.close();
		

	}

}
