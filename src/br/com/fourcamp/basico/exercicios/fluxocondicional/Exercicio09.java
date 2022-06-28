package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.util.Scanner;

public class Exercicio09 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Integer a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		Integer b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		Integer c = sc.nextInt();
		
		encontraMaior(a, b, c);
		sc.close();
		
	}

	public static void encontraMaior(Integer a, Integer b, Integer c) {
		Integer maior = a;
		if (b > maior || c > maior) {
		    if (b > c) {
		        maior = b;
		    } else {
		        maior = c;
		    }
		}

		System.out.println("O maior número é " + maior);
	}
}
