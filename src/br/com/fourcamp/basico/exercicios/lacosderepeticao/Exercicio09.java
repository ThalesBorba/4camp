package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio09 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n?mero: ");
		Integer numero = sc.nextInt();
		System.out.println();
		
		for(int x = 1; x <= 10; x++) {
			System.out.println(numero + " X " + x + " = " + (numero * x));
		}
		sc.close();
		
	}
}
