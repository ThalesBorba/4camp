package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer contador = 0;
		Integer pares = 0;
		Integer impares = 0;
		
		while (contador < 10) {
			System.out.println("Digite um n�mero: ");
			Integer numero = sc.nextInt();
			numero = (numero %2 == 0) ? pares++ : impares++;
			contador++;
		}
		
		System.out.println(MessageFormat.format("Voc� digitou {0} n�meros pares e {1} n�meros �mpares", pares, impares));
		sc.close();
	}
	
}
