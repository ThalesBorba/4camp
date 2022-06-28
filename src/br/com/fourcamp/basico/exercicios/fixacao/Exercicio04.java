package br.com.fourcamp.basico.exercicios.fixacao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Double hp;
		Double lp;
		Double ha;
		Double la;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede: ");
		hp = sc.nextDouble();
		System.out.println("Digite a largura da parede: ");
		lp = sc.nextDouble();
		System.out.println("Digite a altura do azulejo: ");
		ha = sc.nextDouble();
		System.out.println("Digite a largura do azulejo: ");
		la = sc.nextDouble();
		
		Double azulejosNecessarios = (hp * lp) / (ha * la);
		
		System.out.println(MessageFormat.format("São necessários {0} azulejos para preencher a parede", azulejosNecessarios));
		sc.close();
	}
	
}
