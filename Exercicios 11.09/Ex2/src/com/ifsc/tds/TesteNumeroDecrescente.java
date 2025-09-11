package com.ifsc.tds;

import java.util.Scanner;

public class TesteNumeroDecrescente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para gerar a sequência decrescente: ");
        int numero = teclado.nextInt();
  
        NumeroDecrescente teste = new NumeroDecrescente();
        teste.imprimirDecrescente(numero);

        teclado.close();
    }
}
