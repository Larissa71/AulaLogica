package br.com.senai;

import java.util.Scanner;

public class MenuRepete {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1) Tabuada com Do While");
			System.out.println("2) Impressao de valor com For");
			System.out.println("3) TABUADA com For");
			System.out.println("4) Excluir");
			System.out.println("9) Sair");
			System.out.println("---------------");
			System.out.println("Informe a opção desejada");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("---TABUADA com Do while---");
				int valor;
				int multiplicador = 0;
						
				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt();
						
				do {
					System.out.println(valor + "x" + multiplicador + "=" + (valor * multiplicador));
					multiplicador++;
				} while(multiplicador <= 10);
				
				break;
				
			case 2:
				System.out.println("---Impressao de valor com For---");
				
					for(int i = 0; i <= 10; i++) {
						System.out.println("Valor do i: " + i);
				}
				
				break;
			
			case 3:
				System.out.println("---TABUADA com For---");
				int valor2;
				
				System.out.println("Informe o valor: ");
				valor2 = tec.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(valor2 + "x" + i + "=" + (valor2 * i));
				}
				
				break;
			
			case 4:
				System.out.println("---EXCLUIR---");
				break;
			
			case 9:
				opcao = "n";
				break;
			
			default:
				System.out.println("Opção inválida.");
				break;
			}
		
			
		} while(opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema finalizado.");
		
	}

}
