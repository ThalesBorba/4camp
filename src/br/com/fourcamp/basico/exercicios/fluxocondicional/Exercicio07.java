package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mensagem = "Escolha inválida!";
		
		System.out.println("Quantos lados tem o polígono: ");
		Integer tipoPoligono = sc.nextInt();
		System.out.println("Qual é a medida de seus lados em cm: ");
		Double ladoEmCm  = sc.nextDouble();
		
//		fórmulas baseadas no proposta do exercício
		switch (tipoPoligono) {
			case 3 -> mensagem = MessageFormat.format("O polígono é um triângulo e sua área é de {0}cm", ladoEmCm * tipoPoligono);
			case 4 -> mensagem = MessageFormat.format("O polígono é um quadrado e sua área é de {0}cm", ladoEmCm * tipoPoligono);
			case 5 -> mensagem = MessageFormat.format("O polígono é um pentágono e sua área é de {0}cm", ladoEmCm * tipoPoligono);
		}
		
		System.out.println(mensagem);
		sc.close();
	}
	
}
