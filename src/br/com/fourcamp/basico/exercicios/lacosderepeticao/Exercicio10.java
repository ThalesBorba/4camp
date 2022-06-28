package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um número entre 12 e 20: ");
			Integer numero = sc.nextInt();
			if (numero >= 12 && numero <= 20) {
				System.out.println("Você digitou o número " + numero);
				break;
			} else {
				System.out.println("Entrada inválida!");
			}
		}
		sc.close();
	}
	
}
