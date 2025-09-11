package com.ifsc.tds;

public class MediaAluno {
    private int[] notas;
    private int indice; 

    public MediaAluno(int quantidadeNotas) {
        notas = new int[quantidadeNotas];
        indice = 0;
    }

    public void adicionarNota(int nota) {
        if (nota < 0 || nota > 100) {
            System.out.println("Erro: nota inválida (" + nota + "). Informe um valor entre 0 e 100.");
            return;
        }
        if (indice >= notas.length) {
            System.out.println("Erro: não é possível adicionar mais notas.");
            return;
        }
        notas[indice] = nota;
        indice++;
    }

    public void calcularMedia() {
        if (indice == 0) {
            System.out.println("Nenhuma nota adicionada.");
            return;
        }
        int soma = 0;
        for (int i = 0; i < indice; i++) {
            soma += notas[i];
        }
        double media = (double) soma / indice;
        System.out.println("Média do aluno: " + media);
    }
}