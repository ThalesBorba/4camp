package br.com.fourcamp.basico.exercicios.extra;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercicio01 {

	public static <V> void main(String[] args) {
		
		HashMap<String, Integer> votos = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Integer votosTotais = 0;
		
		computaVotos(votos, sc);		
		votosTotais = retornaTotalDeEleitores(votos, votosTotais);
		retornaPercentuais(votos, votosTotais);
		
	}

	public static void retornaPercentuais(HashMap<String, Integer> votos, Integer votosTotais) {
		for(Entry<String, Integer> votacao : votos.entrySet()) {
			Integer percentual = (votacao.getValue() * 100) / votosTotais;
			String message = MessageFormat.format("O percentual de {0} em relação ao total foi de {1}%", 
					votacao.getKey(), percentual);
			System.out.println(message);
		}
	}

	public static Integer retornaTotalDeEleitores(HashMap<String, Integer> votos, Integer votosTotais) {
		for (Integer voto : votos.values()) {
			votosTotais += voto;
		}
		System.out.println("\nTivemos o total de " + votosTotais + " eleitores\n");
		return votosTotais;
	}

	public static void computaVotos(HashMap<String, Integer> votos, Scanner sc) {
		System.out.println("Quantos votos recebeu o candidato A: ");
		votos.put("votos do Candidato A", sc.nextInt());
		System.out.println("Quantos votos recebeu o candidato B: ");
		votos.put("votos do Candidato B", sc.nextInt());
		System.out.println("Quantos votos recebeu o candidato C: ");
		votos.put("votos do Candidato C", sc.nextInt());
		System.out.println("Quantos votos foram em branco: ");
		votos.put("votos brancos", sc.nextInt());
		System.out.println("Quantos votos foram nulos: ");
		votos.put("votos nulos", sc.nextInt());
	}
	
}
