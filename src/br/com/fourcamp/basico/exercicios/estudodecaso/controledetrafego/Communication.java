package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.Scanner;

public class Communication {
	
	static Aeronave aeronave = new Aeronave();
	
	Scanner sc = new Scanner(System.in);
	
	
	public void menuInicial() {
		
		System.out.println("\n1- Cadastrar Aeronave \n2- Pousar Aeronave ");
	}
	
	public void menuCadastroAeronave() {
		
		System.out.println("Informe sua matricula: ");
		String matricula = sc.next();
		
		System.out.println("Informe a cor: ");
		String cor = sc.next();
		
		System.out.println("Informe o modelo: ");
		String modelo = sc.next();
		
		Data.salvaAeronave(matricula, cor, modelo);
		
	}
	
	
	public void menuPlanoVoo() {



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
