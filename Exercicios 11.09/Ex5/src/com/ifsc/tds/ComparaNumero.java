package com.ifsc.tds;

public class ComparaNumero {

	public void comparar(int num1, int num2) {
		if (num1 == num2) {
			System.out.println("Os números são iguais: " + num1);
		} else {
			int maior = (num1 > num2) ? num1 : num2;
			int menor = (num1 < num2) ? num1 : num2;
			System.out.println("Os números são diferentes.");
			System.out.println("Maior: " + maior);
			System.out.println("Menor: " + menor);
		}

	}
}