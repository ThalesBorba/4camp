package br.com.fourcamp.basico.exercicios.vetores;

import java.util.Scanner;

public class Exercicio02 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[5];
		
		for (Integer x = 0; x < 5; x++) {
			System.out.print("Digite um nome: ");
			nomes[x] = sc.nextLine();
		}
		
		System.out.println("\nOs nomes que você digitou foram: ");
		for (String nome : nomes) {
			System.out.println(">> " + nome);
		}
		
		System.out.println("\nE na ordem inversa ficam: ");
		for (Integer x = 4; x >= 0; x--) {
			System.out.println(">> " + nomes[x]);
		}
		sc.close();
	}
	
}
