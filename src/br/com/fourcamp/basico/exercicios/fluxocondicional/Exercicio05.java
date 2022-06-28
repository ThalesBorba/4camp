package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		Integer c = sc.nextInt();
		
		ordenaNumeros(a, b, c);
		sc.close();
		
	}

	public static void ordenaNumeros(Integer a, Integer b, Integer c) {
		Integer maior = a;
		if (b > maior || c > maior) {
		    if (b > c) {
		        maior = b;
		    } else {
		        maior = c;
		    }
		}
		Integer menor = a;
		if (b < menor || c < menor) {
		    if (b < c) {
		        menor = b;
		    } else {
		        menor = c;
		    }
		}

		Integer mediano = b + c + a - maior - menor;
		String message = MessageFormat.format("Os números em ordem crescente ficam: {0}, {1}, {2}", menor, mediano, maior);
		System.out.println(message);
	}
	
	
	
}
