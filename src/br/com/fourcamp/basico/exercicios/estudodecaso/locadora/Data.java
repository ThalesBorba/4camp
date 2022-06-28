package br.com.fourcamp.basico.exercicios.estudodecaso.locadora;

import java.util.HashMap;

public class Data {

	static HashMap<Integer, Cliente> clientes = new HashMap<>();
	static HashMap<Cliente, Filme> locacoes = new HashMap<>();
	static HashMap<Integer, Filme> fitas = new HashMap<>();

	public String adicionaFilme(Filme filme) {
		fitas.put(fitas.size() +1, filme);
		return "Filme adicionado!";
	}

	public Cliente verificaCliente(Integer cpf) {
		for (Cliente cliente: clientes.values()) {
			if (cpf.equals(cliente.getCpf())) {
				return cliente;
			}
		} return null;
	}

	public String cadastraCliente(Cliente cliente) {
		clientes.put(clientes.size() +1, cliente);
		return "Cliente cadastrado!";
	}

	public String salvaLocacao(Cliente cliente, Filme filme) {
		locacoes.put(cliente, filme);
		return "Operação cadastrada!";
	}

	public Filme resgataFilme(Integer numeroDaFita) {
		if (fitas.containsKey(numeroDaFita)) {
			return fitas.get(numeroDaFita);
		}
		return null;
	}

	
	static void populaFitas() {
		Filme filme1 = new Filme("Vingadores", GeneroEnum.ACAO, FaixaEtariaEnum.PG_13);
		Filme filme2 = new Filme("It, a Coisa", GeneroEnum.TERROR, FaixaEtariaEnum.PG_17);
		Filme filme3 = new Filme("O Senhor dos An�is: ASDA", GeneroEnum.FANTASIA, FaixaEtariaEnum.PG_13);
		Filme filme4 = new Filme("O Senhor dos An�is: ADT", GeneroEnum.FANTASIA, FaixaEtariaEnum.PG_13);
		Filme filme5 = new Filme("O Senhor dos An�is: ORDR", GeneroEnum.FANTASIA, FaixaEtariaEnum.PG_13);
		Filme filme6 = new Filme("As Branquelas", GeneroEnum.COMEDIA, FaixaEtariaEnum.PG_13);
		Filme filme7 = new Filme("Duna", GeneroEnum.FANTASIA, FaixaEtariaEnum.PG_13);
		Filme filme8 = new Filme("Vingadores", GeneroEnum.ACAO, FaixaEtariaEnum.PG_13);
		Filme filme9 = new Filme("Interestelar", GeneroEnum.FICCAO_CIENTIFICA, FaixaEtariaEnum.PG_13);
		Filme filme10 = new Filme("Tr�s An�ncios para um Crime", GeneroEnum.DRAMA, FaixaEtariaEnum.R);
		Filme filme11 = new Filme("A Origem", GeneroEnum.FICCAO_CIENTIFICA, FaixaEtariaEnum.PG_13);
		Filme filme12 = new Filme("Todo Mundo em P�nico", GeneroEnum.COMEDIA, FaixaEtariaEnum.R);
		Filme filme13 = new Filme("Onde os Fracos N�o T�m Vez", GeneroEnum.DRAMA, FaixaEtariaEnum.R);
		Filme filme14 = new Filme("Por Lugares Incr�veis", GeneroEnum.ROMANCE, FaixaEtariaEnum.G);
		Filme filme15 = new Filme("Titanic", GeneroEnum.ROMANCE, FaixaEtariaEnum.PG_17);
		Filme filme16 = new Filme("Jogos Mortais", GeneroEnum.TERROR, FaixaEtariaEnum.R);
		Filme filme17 = new Filme("As Branquelas", GeneroEnum.COMEDIA, FaixaEtariaEnum.PG_13);
		Filme filme18 = new Filme("Matrix", GeneroEnum.FICCAO_CIENTIFICA, FaixaEtariaEnum.PG_17);
		Filme filme19 = new Filme("Matrix: Reloaded", GeneroEnum.FICCAO_CIENTIFICA, FaixaEtariaEnum.PG_17);
		Filme filme20 = new Filme("Matrix: Revolutions", GeneroEnum.FICCAO_CIENTIFICA, FaixaEtariaEnum.PG_17);
		
		fitas.put(1, filme1);
		fitas.put(2, filme2);
		fitas.put(3, filme3);
		fitas.put(4, filme4);
		fitas.put(5, filme5);
		fitas.put(6, filme6);
		fitas.put(7, filme7);
		fitas.put(8, filme8);
		fitas.put(9, filme9);
		fitas.put(10, filme10);
		fitas.put(11, filme11);
		fitas.put(12, filme12);
		fitas.put(13, filme13);
		fitas.put(14, filme14);
		fitas.put(15, filme15);
		fitas.put(16, filme16);
		fitas.put(17, filme17);
		fitas.put(18, filme18);
		fitas.put(19, filme19);
		fitas.put(20, filme20);
		
		}

	}
	
	
