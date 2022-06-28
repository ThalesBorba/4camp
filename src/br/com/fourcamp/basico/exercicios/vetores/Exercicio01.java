package br.com.fourcamp.basico.exercicios.vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		Integer total = 0;
		
		for (Integer x = 0; x < 5; x++) {
			System.out.print("Digite um n�mero: ");
			numeros[x] = sc.nextInt();
			total += numeros[x];
		}
		
		System.out.println("\nA soma dos n�meros foi: " + total);
		System.out.println("Os n�meros que voc� digitou foram: ");
		
		for (Integer numero : numeros) {
			System.out.println(">> " + numero);
		}
		sc.close();
	}
	
}
