package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para feminino e 2 para masculino: ");
		Integer sexo = sc.nextInt();
		System.out.println("Digite sua altura: ");
		Double altura  = sc.nextDouble();
		
		Double pesoIdeal = (sexo == 1) ? (62.1 * altura) - 44.7  : (72.7 * altura) - 58;
		String pesoIdealString = String.format("%.1f", pesoIdeal);
		System.out.println(MessageFormat.format("O seu peso ideal é de {0}Kg", pesoIdealString));
		sc.close();
	}
	
}
