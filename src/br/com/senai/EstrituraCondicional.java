package br.com.senai;

public class EstrituraCondicional {
	public static void main(String[] args) {
		int idade = 25;
		
		if (idade < 12) {
			System.out.println("jovem");
		} else if(idade < 18) {
			System.out.println("adulto");
		} else if(idade < 65) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
	}
}
