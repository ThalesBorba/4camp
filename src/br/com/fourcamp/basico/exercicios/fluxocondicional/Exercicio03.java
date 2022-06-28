package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		Integer senha = sc.nextInt();
		
		String message = (senha == 1234) ? "ACESSO PERMITIDO" : "ACESSO NEGADO";
		System.out.println(message);
		sc.close();
		
	}

}
