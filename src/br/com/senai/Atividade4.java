package br.com.senai;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;

		do {
			System.out.println("-----MENU-----");
			System.out.println("1) Verificar sexo e idade ");
			System.out.println("2) Contagem de valores");
			System.out.println("3) TABUADA ");
			System.out.println("4) Cadastrar cursos");
			System.out.println("Informe a opção desejada");
			opcaoDoMenu = tec.nextInt();

			switch (opcaoDoMenu) {
			case 1:
				System.out.println("--- IDADE e SEXO ---");
				String nome;
				int anoDeNascimento;
				String sexo = "m";
				int idade;

				System.out.print("Informe o nome: ");
				nome = tec.next();
				System.out.print("Informe o sexo: [M/F]");
				sexo = tec.next();

				if (sexo.equals("m")) {
					System.out.println("Você é do sexo masculino");
				}
				if (!sexo.equals("m")) {
					System.out.println("Você é do sexo femenino");

				} else if (!sexo.equals("m") || !sexo.equals("f")) {
					System.out.println("Opção inválida!");
				}
				System.out.print("Informe seu ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				idade = 2021 - anoDeNascimento;

				System.out.println(nome + "você nasceu em" + anoDeNascimento + "e tem" + idade + "anos");

				if (idade < 12) {
					System.out.println("Você ainda é criança");
				} else if (idade >= 12 && idade < 18) {
					System.out.println("Você é jovem");
				} else if (idade >= 18 && idade < 65) {
					System.out.println("Você é adulto");
				} else {
					System.out.println("Você já é idoso");
				}
				if (idade < 16) {
					System.out.println("Você não pode votar");
				} else if ((idade >= 16 && idade < 18) || idade > 70) {
					System.out.println("seu voto é opcional");
				} else {
					System.out.println("seu voto é obrigatório");
				}
				if (idade < 18) {
					System.out.println("Você não pode tirar a habilitação");
				} else {
					System.out.println("Você já pode tirar a habilitação");
				}

				break;

			case 2:
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
				}
				if (primeiroValor > segundoValor) {
					while (segundoValor <= primeiroValor) {
						System.out.println(segundoValor);
						segundoValor++;
					}
				} else {
					while (primeiroValor > segundoValor) {
						System.out.println(segundoValor);
						segundoValor++;
					}
				}
				break;

			case 4:
				System.out.println("---CURSOS---");
				String[] cursos = new String[5];
				String inserirCurso = "s";

				for (int i = 0; i < cursos.length; i++) {
					System.out.println(cursos[i]);
				}
				while (inserirCurso == "s") {
					System.out.print("Informe o nome do curso: ");
					System.out.println("Deseja cadastrar um novo curso? [S/N]");
				}
				break;
			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("Sistema encerrado");
	}
}
