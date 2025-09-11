package com.ifsc.tds;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();
     
        MaiorNumero teste = new MaiorNumero();
        teste.encontrarMaior(num1, num2);
        

        teclado.close();
    }
}
