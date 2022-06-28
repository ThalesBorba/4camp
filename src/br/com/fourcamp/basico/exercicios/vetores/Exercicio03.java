package br.com.fourcamp.basico.exercicios.vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[10];
		Integer[] numerosmultiplicados = new Integer[10];
		
		for (Integer x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			numeros[x] = sc.nextInt();
		}
		
		for (Integer x = 0; x < 10; x++) {
			numerosmultiplicados[x] = numeros[x] * 5;
		}
		
		for (Integer x = 0; x < 10; x++) {
			System.out.println(numeros[x] + " " + numerosmultiplicados[x]);
		}
		
		sc.close();
	}
	
}
