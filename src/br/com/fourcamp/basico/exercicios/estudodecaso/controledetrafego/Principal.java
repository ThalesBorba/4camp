package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		Communication communication = new Communication();
		
		communication.menuCadastroAeronave();
		
		communication.menuPlanoVoo();
	}

}
