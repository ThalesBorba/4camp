package br.com.fourcamp.basico.exercicios.fixacao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o raio do recipiente: ");
		Double R = sc.nextDouble();
		System.out.println("Digite a altura do recipiente: ");
		Double A = sc.nextDouble();
		
		Double V = 3.14159 * R * R * A;
		String formula = "3.14159 * R * R * A";
		
		System.out.println(MessageFormat.format("O volume do recipiente, segundo a fórmula {0} é de: {1}", formula, V));
		sc.close();
		
	}
	
	

}
