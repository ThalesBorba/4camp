package br.com.fourcamp.basico.exercicios.vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		Integer total = 0;
		
		for (Integer x = 0; x < 5; x++) {
			System.out.print("Digite um número: ");
			numeros[x] = sc.nextInt();
			total += numeros[x];
		}
		
		System.out.println("\nA soma dos números foi: " + total);
		System.out.println("Os números que você digitou foram: ");
		
		for (Integer numero : numeros) {
			System.out.println(">> " + numero);
		}
		sc.close();
	}
	
}
