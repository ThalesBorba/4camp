package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.Objects;

public class Aeronave {

	String matricula;
	String cor;
	String modelo;
	boolean isPousando;

	public Aeronave() {

	}

	public String getMatricula() {
		return matricula;
	}

	public Aeronave(String matricula, String cor, String modelo) {
		this.matricula = matricula;
		this.cor = cor;
		this.modelo = modelo;
		this.isPousando = false;
	}
}
