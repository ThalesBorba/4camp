package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento: ");
		Integer anoDeNascimento = sc.nextInt();
		
		String message = ((2022 - anoDeNascimento) >= 16) ? "Pode votar" : "Ainda não pode votar";
		System.out.println(message);
		sc.close();
		
	}
	
}
