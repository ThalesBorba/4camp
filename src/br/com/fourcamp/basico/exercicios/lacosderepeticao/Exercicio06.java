package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer dentroDoIntervalo = 0;
		Integer foraDoIntervalo = 0;
		
		for (Integer x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			Integer numero = sc.nextInt();
			numero = (numero >= 10 && numero <= 20) ? dentroDoIntervalo++ : foraDoIntervalo++;
		}
		
		System.out.println(MessageFormat.format("Foram digitados {0} números dentro do intervalo entre [10 e 20], e {1} fora", 
				dentroDoIntervalo, foraDoIntervalo));
		sc.close();
		
	}
	
}
