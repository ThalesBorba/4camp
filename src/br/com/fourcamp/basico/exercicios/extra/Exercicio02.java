package br.com.fourcamp.basico.exercicios.extra;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer numeroSecreto = recebeNumeroSecreto(sc);
		recebePalpites(sc, numeroSecreto);
					
		sc.close();	
		
	}

	public static void recebePalpites(Scanner sc, Integer numeroSecreto) {
		Integer chute;
		Integer contador = 1;
		
		System.out.println("\nAgora é sua vez! Qual é o número que seu colega digitou? Chute: ");
		chute = sc.nextInt();
		if (chute == numeroSecreto) {
			System.out.println("Incrível! Acertou de primeira!");
		} else {
			while (chute != numeroSecreto) {
				if (chute > numeroSecreto) {
					contador++;
					String message = MessageFormat.format("\nChute número {0}: {1}. \n*** Chutou alto! ***", contador, chute);
					System.out.println(message);
					System.out.println("\nTente de novo: ");
					chute = sc.nextInt();
				} else {
					contador++;
					String message = MessageFormat.format("\nChute número {0}: {1}. \n*** Chutou baixo ***", contador, chute);
					System.out.println(message);
					System.out.println("\nTente de novo: ");
					chute = sc.nextInt();
				} 
			} String message = MessageFormat.format("\n*** Acertou! Parabéns! Você precisou de {0} chances ***", contador + 1);
				System.out.println(message);
		}
	}

	public static Integer recebeNumeroSecreto(Scanner sc) {
		System.out.println("Digite o número secreto (entre 0 e 100): ");
		Integer numeroSecreto = sc.nextInt();
		while (numeroSecreto < 0 || numeroSecreto > 100) {
			System.out.println("Pega leve! Entre 0 e 100! Digite: ");
			numeroSecreto = sc.nextInt();
		}
		return numeroSecreto;
	}
	
}
