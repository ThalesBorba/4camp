package br.com.fourcamp.basico.exercicios.fluxocondicional;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mensagem = "Escolha inv�lida!";
		
		System.out.println("Quantos lados tem o pol�gono: ");
		Integer tipoPoligono = sc.nextInt();
		System.out.println("Qual � a medida de seus lados em cm: ");
		Double ladoEmCm  = sc.nextDouble();
		
//		f�rmulas baseadas no proposta do exerc�cio
		switch (tipoPoligono) {
			case 3 -> mensagem = MessageFormat.format("O pol�gono � um tri�ngulo e sua �rea � de {0}cm", ladoEmCm * tipoPoligono);
			case 4 -> mensagem = MessageFormat.format("O pol�gono � um quadrado e sua �rea � de {0}cm", ladoEmCm * tipoPoligono);
			case 5 -> mensagem = MessageFormat.format("O pol�gono � um pent�gono e sua �rea � de {0}cm", ladoEmCm * tipoPoligono);
		}
		
		System.out.println(mensagem);
		sc.close();
	}
	
}
