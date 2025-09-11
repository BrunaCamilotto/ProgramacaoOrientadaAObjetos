package com.ifsc.tds;

public class TrocaNumero {

	public void trocar(int numA, int numB) {
		System.out.println("Antes da troca: NumA = " + numA + ", NumB = " + numB);

		int temp = numA;
		numA = numB;
		numB = temp;

		System.out.println("Depois da troca: NumA = " + numA + ", NumB = " + numB);
	}
}