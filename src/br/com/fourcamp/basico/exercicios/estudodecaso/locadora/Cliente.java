package br.com.fourcamp.basico.exercicios.estudodecaso.locadora;

import java.util.Objects;

public class Cliente {

	private String nome;
	private Integer cpf;
	
	public Cliente(String nome, Integer cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getCpf() {
		return cpf;
	}
}
