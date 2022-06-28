package br.com.fourcamp.basico.exercicios.lacosderepeticao;

public class Exercicio07 {

	public static void main(String[] args) {
		
		for(Integer x = 0; x < 11; x++) {
			System.out.println("Hello world!");
		}
		
		System.out.println();
		
		Integer contador = 0;
		while (contador < 11) {
			System.out.println("Hello world!");
			contador++;
		}
	}
}
