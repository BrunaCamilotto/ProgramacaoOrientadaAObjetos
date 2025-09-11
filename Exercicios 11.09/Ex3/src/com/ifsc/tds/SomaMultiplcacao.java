package com.ifsc.tds;

import java.math.BigInteger;

public class SomaMultiplcacao {
    public static void main(String[] args) {
        int somaImpares = 0;
        BigInteger multiplicacaoPares = BigInteger.ONE; 

        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) { 
                somaImpares += i;
            } else if (i > 0) { 
                multiplicacaoPares = multiplicacaoPares.multiply(BigInteger.valueOf(i));
            }
        }

        System.out.println("Soma dos números ímpares entre 0 e 30: " + somaImpares);
        System.out.println("Multiplicação dos números pares entre 0 e 30: " + multiplicacaoPares);
    }
}
