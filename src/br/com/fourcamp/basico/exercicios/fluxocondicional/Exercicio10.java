package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio10 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo lado do triângulo: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro lado do triângulo: ");
		Integer c = sc.nextInt();
		
		String mensagem = (a == b && b == c && a == c) ? "equilátero" : (a != b && b != c && a != c) ? "escaleno" : "isósceles";
		System.out.println(MessageFormat.format("O triângulo é {0}", mensagem));
		sc.close();
		
	}

}
