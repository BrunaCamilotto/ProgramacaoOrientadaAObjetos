package com.ifsc.tds;

public class TesteMediaAluno {

	public static void main(String[] args) {
		MediaAluno aluno = new MediaAluno(5);
		aluno.adicionarNota(80);
		aluno.adicionarNota(90);
		aluno.adicionarNota(100);
		aluno.adicionarNota(87);
		aluno.calcularMedia();
	}
}