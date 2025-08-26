package com.ifsc.tds;

public class Main {

	public static void main(String[] args) {
		int primeiroNumero = 10, segundoNumero = 3;
		float subtracao = 0f, adicao = 0f, multiplicacao = 0f, divisao = 0f;

		subtracao = primeiroNumero - segundoNumero;
		adicao = primeiroNumero + segundoNumero;
		divisao = primeiroNumero / segundoNumero;
		multiplicacao = primeiroNumero * segundoNumero;

		System.out.println("A = 10  B = 3\n");

		System.out.println("A + B: " + adicao);
		System.out.println("A - B: " + subtracao);
		System.out.println("A / B: " + divisao);
		System.out.println("A * B: " + multiplicacao);

	}

}
