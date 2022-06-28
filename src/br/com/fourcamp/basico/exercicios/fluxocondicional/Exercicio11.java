package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio11 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro ângulo do triângulo: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo ângulo do triângulo: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro ângulo do triângulo: ");
		Integer c = sc.nextInt();
		
		String mensagem = (a == 90 || b == 90 || c == 90) ? "retângulo" : (a > 90 || b > 90 || a > 90) ? "obtusângulo" : "acutângulo";
		System.out.println(MessageFormat.format("O triângulo é {0}", mensagem));
		
		sc.close();
		
	}
	
}
