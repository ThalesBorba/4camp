package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

import java.util.Scanner;

public class Communication {

    public void marcaConsulta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- BEM-VINDO A NOSSA CLÍNICA --------");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Possui convênio? Se sim digite o número do cartão. Se não, digite enter: ");
        String cartao = Util.validaConvênio(scanner);

        System.out.println("Digite 1 para segunda, 2 para quarta, 3 para sexta: ");
        Integer dia = Util.validaMedico(scanner);

        System.out.println("Digite 1 para manhã, 2 para tarde: ");
        Integer turno = Util.validaTurno(scanner);

        Medico medico = Util.retornaMedico(dia, turno);

        //escolher remédio de acordo com o médico






    }

}
