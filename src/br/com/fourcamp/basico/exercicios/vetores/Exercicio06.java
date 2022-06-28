package br.com.fourcamp.basico.exercicios.vetores;

import java.util.Scanner;

public class Exercicio06 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] pares = new Integer[10];
		Integer[] impares = new Integer[10];
		
		for (Integer x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			Integer numero = sc.nextInt();
			while (numero == 0) {
				System.out.println("Digite um número diferente de 0: ");
				numero = sc.nextInt();
			}
			if (numero % 2 == 0) {
				pares[x] = numero;
				impares[x] = 0;
			} else {
				impares[x] = numero;
				pares[x] = 0;
			}
		}
		
		System.out.println("\nNúmeros pares digitados: ");
		for (Integer x = 0; x < pares.length; x++) {
			if (pares[x] != 0) {
			System.out.println(pares[x]);
			}
		}
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for (Integer x = 0; x < impares.length; x++) {
			if (impares[x] != 0) {
				System.out.println(impares[x]);
				}
		}
		
		sc.close();
}
	
}
