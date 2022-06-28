package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio10 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do tri�ngulo: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo lado do tri�ngulo: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro lado do tri�ngulo: ");
		Integer c = sc.nextInt();
		
		String mensagem = (a == b && b == c && a == c) ? "equil�tero" : (a != b && b != c && a != c) ? "escaleno" : "is�sceles";
		System.out.println(MessageFormat.format("O tri�ngulo � {0}", mensagem));
		sc.close();
		
	}

}
