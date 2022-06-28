package br.com.fourcamp.basico.exercicios.fixacao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a massa do objeto: ");
		Double m = sc.nextDouble();
		System.out.println("Digite a altura a ser levantado: ");
		Double h = sc.nextDouble();
		System.out.println("Digite em quanto tempo deve ser levantado: ");
		Double t = sc.nextDouble();
		
		Double cavalos = (m * h / t) / 745.6999;
		
		System.out.println(MessageFormat.format("A força necessária para realizar a operação é de {0} cavalos", cavalos));
		sc.close();
		
		
	}
	
	
	
	
	
	
	
	
}
