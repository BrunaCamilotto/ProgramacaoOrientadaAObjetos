package com.ifsc.tds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salarioBruto = 0, salarioLiquido = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Insira por gentileza o valor bruto do salario: ");
		salarioBruto = teclado.nextDouble();
		
		
		if(salarioBruto < 1000){
			salarioLiquido = salarioBruto;
		}else if(salarioBruto > 1000 && salarioBruto < 2200){
			salarioLiquido = salarioBruto - (salarioBruto * 0.13);
		}else {
			salarioLiquido = salarioBruto - (salarioBruto * 0.22);
		}

		System.out.println("O valor do salario liquido é: " + salarioLiquido);
		
		teclado.close();
		
	}

}
