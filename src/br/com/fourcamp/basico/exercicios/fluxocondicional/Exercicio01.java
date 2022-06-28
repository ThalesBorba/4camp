package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		Double valorA = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		Double valorB = sc.nextDouble();
		
		String message = (valorA > valorB) ? "O primeiro valor é o maior" : "O segundo valor é o maior";
		System.out.println(message);
		sc.close();
	}
}