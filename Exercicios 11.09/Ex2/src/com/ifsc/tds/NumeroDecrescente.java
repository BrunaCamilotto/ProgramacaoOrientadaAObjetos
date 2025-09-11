package com.ifsc.tds;

public class NumeroDecrescente {
    public void imprimirDecrescente(int numero) {
        System.out.println("Sequência decrescente de " + numero + " até 0:");
        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}