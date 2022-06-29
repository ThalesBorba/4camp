package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego.Aeronave;

public class PlanoDeVoo{

	Aeronave aeronaveMatricula;
	Integer horario;
	String localSaida;
	String localDestino;
	
	public PlanoDeVoo() {
		
	}

	public PlanoDeVoo(Aeronave aeronaveMatricula, Integer horario, String localSaida, String localDestino) {
		this.aeronaveMatricula = aeronaveMatricula;
		this.horario = horario;
		this.localSaida = localSaida;
		this.localDestino = localDestino;
	}
}
