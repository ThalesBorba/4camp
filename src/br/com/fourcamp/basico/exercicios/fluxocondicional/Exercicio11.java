package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio11 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro �ngulo do tri�ngulo: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo �ngulo do tri�ngulo: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro �ngulo do tri�ngulo: ");
		Integer c = sc.nextInt();
		
		String mensagem = (a == 90 || b == 90 || c == 90) ? "ret�ngulo" : (a > 90 || b > 90 || a > 90) ? "obtus�ngulo" : "acut�ngulo";
		System.out.println(MessageFormat.format("O tri�ngulo � {0}", mensagem));
		
		sc.close();
		
	}
	
}
