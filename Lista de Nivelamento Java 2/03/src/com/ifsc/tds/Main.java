package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double jornada = 0;
		
		double valorHora = 0;
		
		double valorHoraExtra = 0;

		System.out.println("Insira o salario por hora do funcionario: ");
		valorHora = teclado.nextDouble();
		
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		jornada = teclado.nextDouble();
		
		
		double jornadaExtra = jornada - 40;
		double salario = (valorHora * jornada) * 4;
		
		if(jornada > 40) {
			
			valorHoraExtra = valorHora + (valorHora * 0.5);
			salario =  salario + (valorHoraExtra * jornadaExtra);
		}
		
		System.out.println("o salario é: " + salario);
		
		
		teclado.close();
		
				
		
	}

}
