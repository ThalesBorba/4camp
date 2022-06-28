package br.com.fourcamp.basico.exercicios.fixacao;

import java.util.Scanner;
import java.text.MessageFormat;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		Double celsius = sc.nextDouble();
		
		Double kelvin = celsius + 273.15;
		Double reaumur = celsius * 0.8;
		Double rankine = celsius * 1.8 + 32 + 459.67;
		Double fahrenheit = celsius * 1.8 +32;
		
		String mensagem = MessageFormat.format("\nTemperatura em Kelvin: {0}K\nTemperatura em Reaumur: {1}Re\n"
				+ "Temperatura em Rankine: {2}Ra\nTemperatura em Fahrenheit: {3}F\n", kelvin, reaumur, rankine, fahrenheit);
		
		System.out.println(mensagem);
		sc.close();
		
	}
}
