package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.Scanner;

public class Communication {
	
	static Aeronave aeronave = new Aeronave();

	public static void menuInicial(Scanner sc) {
		
		System.out.println("\n1- Cadastrar Aeronave \n2- Pousar Aeronave ");
		Integer opcao = sc.nextInt();
		if (opcao == 1) {
			menuCadastroAeronave(sc);
		} else if (opcao == 2) {
			menuPlanoVoo(sc);
		} else {
			System.out.println("Opção inválida");
			menuInicial(sc);
		}
	}
	
	public static void menuCadastroAeronave(Scanner sc) {
		
		System.out.println("Informe sua matricula: ");
		String matricula = sc.next();
		
		System.out.println("Informe a cor: ");
		String cor = sc.next();
		
		System.out.println("Informe o modelo: ");
		String modelo = sc.next();
		
		Data.salvaAeronave(matricula, cor, modelo);
		
	}


	public static void menuPlanoVoo(Scanner sc) {



		System.out.println("Informe sua matricula: ");
		String matricula = sc.next();

		Aeronave aeronave = Data.recuperaAeronave(matricula);

		System.out.println("Informe o hor�rio: ");
		Integer horario = sc.nextInt();

		System.out.println("Informe o local de saida: ");
		String localSaida = sc.next();

		System.out.println("Informe o local de destino: ");
		String localDestino = sc.next();

		System.out.println("Informe o nivel de perigo da viagem escolhendo um n�mero: ");

		for (GrauPerigo perigo : GrauPerigo.values()) {
			System.out.println(perigo.getKey() + " " + perigo.getDescription());
		}

		String option = sc.next();

		System.out.println("Sua solicita��o para pousar foi aceita.");

		Data.salvaPlanoDeVoo(aeronave, horario, localSaida, localDestino);



	}



}
