package br.com.senai;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		System.out.print("informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		int primeiroValor = tec.nextInt();
		System.out.print("informe o segundo valor: ");
		int segundoValor = tec.nextInt();
		int valor2 = tec.nextInt();

		int par = 0;
		int impar = 0;
				
		if(valor1 < valor2) {
			while (valor1 <= valor2)	{
				if(valor1 % 2 == 0) {
					par += 1;
				}
				else {
					impar += 1;
				}
				
				System.out.println(valor1);
		valor1 += 1;
			}
				
	}
		else if (valor1 > valor2) {
		while (valor1 >= valor2) {
			if(valor1 % 2 == 0 ) {
				par += 1;
			}
			else {
				impar += 1;
			}
			System.out.println(valor1); 
			valor1 -= 1;		
		}
	}
}