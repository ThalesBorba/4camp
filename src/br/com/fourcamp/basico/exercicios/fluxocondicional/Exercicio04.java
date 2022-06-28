package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maças você deseja comprar: ");
		Integer quantidade = sc.nextInt();
		
		Double preco = (quantidade >= 12) ? quantidade * 0.25 : quantidade * 0.3;
		String precoString = String.format("%.2f", preco);
		System.out.println("O total foi de R$" + precoString);
		sc.close();
	
}
}
