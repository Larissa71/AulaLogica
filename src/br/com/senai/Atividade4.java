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
			System.out.println("Informe a op��o desejada");
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
					System.out.println("Voc� � do sexo masculino");
				}
				if (!sexo.equals("m")) {
					System.out.println("Voc� � do sexo femenino");

				} else if (!sexo.equals("m") || !sexo.equals("f")) {
					System.out.println("Op��o inv�lida!");
				}
				System.out.print("Informe seu ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				idade = 2021 - anoDeNascimento;

				System.out.println(nome + "voc� nasceu em" + anoDeNascimento + "e tem" + idade + "anos");

				if (idade < 12) {
					System.out.println("Voc� ainda � crian�a");
				} else if (idade >= 12 && idade < 18) {
					System.out.println("Voc� � jovem");
				} else if (idade >= 18 && idade < 65) {
					System.out.println("Voc� � adulto");
				} else {
					System.out.println("Voc� j� � idoso");
				}
				if (idade < 16) {
					System.out.println("Voc� n�o pode votar");
				} else if ((idade >= 16 && idade < 18) || idade > 70) {
					System.out.println("seu voto � opcional");
				} else {
					System.out.println("seu voto � obrigat�rio");
				}
				if (idade < 18) {
					System.out.println("Voc� n�o pode tirar a habilita��o");
				} else {
					System.out.println("Voc� j� pode tirar a habilita��o");
				}

				break;

			case 2:
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia");
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
