package br.com.fourcamp.basico.exercicios.fixacao;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = Pessoa.populaPessoas();
		
		System.out.println(calculaAlturas(pessoas));
		System.out.println(calculaMediaDeAlturaMasculina(pessoas));
		System.out.println(calculaNumeroDeMulheres(pessoas));
	
	}

	public static String calculaNumeroDeMulheres(Pessoa[] pessoas) {
		Integer numeroDeMulheres = 0;
		for (int x = 0; x < pessoas.length; x++) {
			if (pessoas[x].getSexo().equals("F")) {
				numeroDeMulheres++;
			}
	} return "O número de mulheres é: " + numeroDeMulheres;
	}

	public static String calculaMediaDeAlturaMasculina(Pessoa[] pessoas) {
		Double totalDeAlturaMasculina = 0.0;
		for (int x = 0; x < pessoas.length; x++) {
			if (pessoas[x].getSexo().equals("M")) {
				totalDeAlturaMasculina += pessoas[x].getAltura();
			}
		} return "A média de altura masculina é de " +
			String.format("%.2f\n", (totalDeAlturaMasculina / pessoas.length));
	}

	public static String calculaAlturas(Pessoa[] pessoas) {
		Double maiorAltura = pessoas[0].getAltura();
		Double menorAltura = pessoas[0].getAltura();
		for (int x = 1; x < pessoas.length; x++) {
			if (pessoas[x].getAltura() > pessoas[x-1].getAltura()) {
				maiorAltura = pessoas[x].getAltura();
			}
			if (pessoas[x].getAltura() < pessoas[x-1].getAltura()) {
				menorAltura = pessoas[x].getAltura();
			}			
		} return MessageFormat.format("A maior altura é de {0}m\nA menor altura é de {1}m\n", maiorAltura, menorAltura);
	}
	
	public static class Pessoa{
		
		private String nome;
		private Double altura;
		private String sexo;
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getAltura() {
			return altura;
		}

		public void setAltura(Double altura) {
			this.altura = altura;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		@Override
		public String toString() {
			return nome;
		}
		
		private static Pessoa[] populaPessoas() {
			Scanner sc = new Scanner(System.in);
			Pessoa[] pessoas = new Pessoa[10];
			for (int x = 0; x < pessoas.length; x++) {
				Pessoa pessoa = new Pessoa();
				
				System.out.println("Digite o nome: ");
				pessoa.setNome(sc.next());
				System.out.println("Digite a altura: ");
				pessoa.setAltura(sc.nextDouble());
				System.out.println("Digite o sexo [M/F]: ");
				pessoa.setSexo(sc.next());
				pessoas[x] = pessoa;
			}
			sc.close();
			return pessoas;
		}
	}
	
}
