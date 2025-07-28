package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Faz a impressão das opções na tela //
		Scanner teclado = new Scanner(System.in);
		System.out.println("|------- CALCULADORA --------|");
		System.out.println("|1 - Soma (+)                ");
		System.out.println("|2 - Subtração (-)           ");
		System.out.println("|3 - Multiplicação (*)       ");
		System.out.println("|4 - Divisão (/)             ");
		System.out.print("|Digite a operação desejada: ");
		
		int alternativa = teclado.nextInt();
		
		// Validação das escolhas //
		if (alternativa >= 1 && alternativa <= 4) {
			System.out.println("|Você escolheu a operação: " + alternativa);
		
			// Solicita os dois números só se a escolha for válida //
		
			System.out.print("|Digite o primeiro número: ");
			float n1 = teclado.nextFloat();
		
			System.out.print("|Digite o segundo número: ");
			float n2 = teclado.nextFloat();
		
			float resultado;
		
			// Executa a operação conforme a escolha //
			if (alternativa == 1) {
				resultado = n1 + n2;
				System.out.println("|Resultado da soma: " + resultado);
			} else if (alternativa == 2) {
				resultado = n1 - n2;
				System.out.println("|Resultado da subtração: " + resultado);
			} else if (alternativa == 3) {
				resultado = n1 * n2;
				System.out.println("|Resultado da multiplicação: " + resultado);
			} else {
				if (n2 == 0) {
					System.out.println("|Erro: divisão por zero.");
				} else {
					resultado = n1 / n2;
					System.out.println("|Resultado da divisão: " + resultado);
				}
			}
			
		} else {
			// Escolha inválida //
			System.out.println("|Escolha apenas as funções apresentadas de 1 à 4.");
		}
	}
}
