package br.com.fourcamp.basico.exercicios.estudodecaso.locadora;

import java.util.Scanner;

public class Util {

    public static String validaGenero(Scanner scanner) {
        Boolean isInvalid = true;
        String genero = null;
        while (isInvalid) {
            genero = scanner.next();
            switch (genero) {
                case "TERROR", "ACAO", "COMEDIA", "ROMANCE", "DRAMA", "FICCAO_CIENTIFICA", "FANTASIA" -> isInvalid = false;
                default -> System.out.println("Escolha inválida!");
            }
        }
        return genero;
    }

    public static String validaFaixaEtaria(Scanner scanner) {
        Boolean isInvalid = true;
        String faixaEtaria = null;
        while (isInvalid) {
            faixaEtaria = scanner.next();
            switch (faixaEtaria) {
                case "G", "PG_13", "PG_17", "R", "X" -> isInvalid = false;
                default -> System.out.println("Escolha inválida!");
            }
        }
        return faixaEtaria;
    }

    public static Integer validaCpf(Scanner scanner) {
        Integer cpfNumber;
        while (true) {
            String cpf = scanner.next();
            if (cpf.length() != 11) {
                System.out.println("Cpf deve ter 11 dígitos!");
            } else {
                try {
                    cpfNumber = Integer.parseInt(cpf);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Somente números!");
                }
            }

        }
        return cpfNumber;
    }

    public static Filme validaLocacao(Scanner scanner) {
        Data data = new Data();
        while (true) {
            String numeroDaFita = scanner.next();
            try {
                if (data.resgataFilme(Integer.parseInt(numeroDaFita)) == null) {
                    System.out.println("Fita não encontrada!");
                } else {
                    return data.resgataFilme(Integer.parseInt(numeroDaFita));
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número!");
            }
        }

    }
}
