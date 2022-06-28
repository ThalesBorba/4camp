package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		
		while (numero < 1 || numero > 10) {
		System.out.println("Digite um número de 1 a 10: ");
		numero = sc.nextInt();
		}
		
		for(int x = 1; x <= 10; x++) {
			System.out.println(numero + " X " + x + " = " + (numero * x));
		}
		sc.close();
		
	}
}
