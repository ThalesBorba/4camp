package br.com.fourcamp.basico.calculadora;

import java.util.Scanner;

public class Main implements Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double valorA;
		Double valorB;
		String operador;
		
		
		System.out.println("Digite o primeiro número: ");
		valorA = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		valorB = sc.nextDouble();
		System.out.println("Insira o operador: ");
		operador = sc.next();
		
		System.out.println("O resultado foi: " + Calculadora.calculaValor(operador, valorA, valorB));
		
		sc.close();
	}
	
}
