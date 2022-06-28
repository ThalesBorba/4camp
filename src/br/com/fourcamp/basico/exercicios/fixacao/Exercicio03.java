package br.com.fourcamp.basico.exercicios.fixacao;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		HashMap<String, Double> funcionarios = new HashMap<>();
		Double totalSalarios = 0.0;
		
		Scanner sc = new Scanner(System.in);
		registraFuncionarios(funcionarios, sc);
		sc.close();
		
		System.out.println(calculaMediaSalarial(funcionarios, totalSalarios));
		
		
	}

	public static Double calculaMediaSalarial(HashMap<String, Double> funcionarios, Double totalSalarios) {
		for (Double salario : funcionarios.values()) {
		    totalSalarios += salario;
		} return totalSalarios / funcionarios.size();
	}

	public static void registraFuncionarios(HashMap<String, Double> funcionarios, Scanner sc) {
		while (true) {
			System.out.println("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			System.out.println("Digite o salário: ");
			Double salario = sc.nextDouble();
			
			funcionarios.put(nome, salario);
			
			System.out.println("Deseja continuar? [S/N]");
			if (sc.next().equalsIgnoreCase("N")) {
				break;
			}
			
		}
	}

}
