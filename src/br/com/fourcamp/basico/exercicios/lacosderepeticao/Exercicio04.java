package br.com.fourcamp.basico.exercicios.lacosderepeticao;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> idades = new ArrayList<Integer>();
		List<Integer> adultos = new ArrayList<Integer>();
		Integer totalDasIdades = 0;
		
		recebeIdades(sc, idades, adultos);
		System.out.println(calculaMedia(idades, totalDasIdades));
		
		String mensagem = (adultos.size() == 0) ? "Aqui tem mais crianças" : ((idades.size() / adultos.size()) <= 2) ? 
				"Aqui tem mais adultos" : "Aqui tem mais crianças";
		System.out.println(mensagem);
		
		
	}

	public static String calculaMedia(List<Integer> idades, Integer totalDasIdades) {
		for (Integer idade : idades) {
			totalDasIdades += idade;
		}
		Integer mediaDasIdades = totalDasIdades / idades.size();
		return MessageFormat.format("A média das idades é de {0} anos", mediaDasIdades);
	}

	public static void recebeIdades(Scanner sc, List<Integer> idades, List<Integer> adultos) {
		
		while (true) {
			System.out.println("Digite sua idade (0 para sair): ");
			Integer idade = sc.nextInt();
			if (idade == 0) { 
				break;
				} else {
					idades.add(idade);
					if (idade >= 18) {
						adultos.add(idade);
						}
					
				}
		}
	}
	
}
