package com.ifsc.tds;

public class MaiorNumero {
    public void encontrarMaior(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais: " + num1);
        }
    }
}
