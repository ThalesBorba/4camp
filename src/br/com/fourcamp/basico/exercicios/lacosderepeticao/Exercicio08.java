package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer contador = 0;
		Double notaTotal = 0.0;
		
		while (contador < 3) {
			System.out.println(MessageFormat.format("Digite a {0}ª nota : ", contador +1));
			notaTotal += sc.nextDouble();
			contador++;
		}
		
		Double media = notaTotal / 3;
		String message = (media < 6.0) ? MessageFormat.format("Sua média foi {0}, e infelizmente você está reprovado", media) : 
			MessageFormat.format("Sua média foi {0}. Parabéns, você foi aprovado!", media);
		System.out.println(message);
		sc.close();
	}
	
}
