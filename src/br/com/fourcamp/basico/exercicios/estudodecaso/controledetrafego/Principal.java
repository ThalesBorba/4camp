package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		Data.populatAeronaveList();

		Communication.menuInicial(scanner);
	}

}
