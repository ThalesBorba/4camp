package br.com.fourcamp.basico.exercicios.estudodecaso.locadora;

import java.util.Scanner;

public class Communication {
	
	static void Menu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("--------- SEJA BEM-VINDO A NOSSA LOCADORA! ---------");
		Integer opcao = 0;
		while (opcao != 1 && opcao != 2) {
			System.out.println("Você deseja: \n1 - Cadastrar uma fita \n2 - Alugar um filme");
			try {
				opcao = sc.nextInt();
				if (opcao == 1) {
					recebeDadosDoFilme(sc);
				} else {
					alugaFilme(sc);
				}

			} catch (NumberFormatException e) {
				System.out.println("Por favor, digite um número!");
			}

		}
		
	}

	private static void alugaFilme(Scanner scanner) {
		Data data = new Data();

		System.out.println("Digite seu cpf: ");
		Integer cpf = Util.validaCpf(scanner);

		Cliente cliente = null;
		if (data.verificaCliente(cpf) == null) {
			cliente = receDadosDeNovoCliente();
		} else {
			cliente = data.verificaCliente(cpf);
		}

		System.out.println("Digite o número da fita que deseja alugar: ");
		Filme filme = Util.validaLocacao(scanner);

		data.salvaLocacao(cliente, filme);

	}

	static Filme recebeDadosDoFilme(Scanner sc) {
		Data data = new Data();

		System.out.println("Qual � o nome do filme: ");
		String nome = sc.next();
		System.out.println("Qual � o g�nero? \nOp��es: TERROR, ACAO, COMEDIA, ROMANCE, DRAMA, FICCAO_CIENTIFICA, FANTASIA"
				+ "\nDigite:");
		String genero = Util.validaGenero(sc);
		System.out.println("Qual � a faixa et�ria? \nOp��es: G, PG_13, PG_17, R, X\nDigite:");
		String faixaEtaria = Util.validaFaixaEtaria(sc);
		
		Filme filme = new Filme(nome, GeneroEnum.valueOf(genero), FaixaEtariaEnum.valueOf(faixaEtaria));

		System.out.println(data.adicionaFilme(filme));

		System.out.println("Obrigado pela preferência!");
		sc.close();
		return filme;
	}
	
	static Cliente receDadosDeNovoCliente() {
		Data data = new Data();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu cpf (somente n�meros): ");
		Integer cpf = Util.validaCpf(sc);
		
		Cliente cliente = new Cliente(nome, cpf);

		data.cadastraCliente(cliente);

		System.out.println("Cliente cadastrado!");
		return cliente;
	}
	

	
}
