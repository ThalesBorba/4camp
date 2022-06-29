package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Util {

    public static String validaConvênio(Scanner scanner) {
        while (true) {
            String convenio = scanner.nextLine();
            if (convenio.isBlank()) {
                return "Sem convênio";
            } else {
                try {
                    Long convenioLong = Long.parseLong(convenio);
                    return convenio;
                } catch (NumberFormatException e) {
                    System.out.println("Digite o número de sua carteira, ou não digite nada e aperte enter");
                }
            }
        }
    }

    public static Integer validaMedico(Scanner scanner) {
        Boolean isInvalid = true;
        Integer diaInteger = null;
        while (isInvalid) {
            String dia = scanner.next();
            switch (dia) {
                case "1", "2", "3" -> {
                    diaInteger = Integer.parseInt(dia);
                    isInvalid = false;
                }
                default -> System.out.println("Escolha 1, 2 ou 3");
            }
        }
        return diaInteger;
    }

    public static Integer validaTurno(Scanner scanner) {
        Boolean isInvalid = true;
        Integer diaInteger = null;
        while (isInvalid) {
            String dia = scanner.next();
            switch (dia) {
                case "1", "2" -> {
                    diaInteger = Integer.parseInt(dia);
                    isInvalid = false;
                }
                default -> System.out.println("Escolha 1 ou 2");
            }
        }
        return diaInteger;
    }

    public static Medico retornaMedico(Integer dia, Integer turno) {
        Medico medico = null;
        switch (dia) {
            case 1 -> medico = (turno == 1) ? Medico.SEGUNDAMANHA : Medico.SEGUNDATARDE;
            case 2 -> medico = (turno == 1) ? Medico.QUARTAMANHA : Medico.QUARTATARDE;
            case 3 -> medico = (turno == 1) ? Medico.SEXTAMANHA : Medico.SEXTATARDE;
        }
        return medico;
    }

    public static List<Remedio> retornaRemedios(Medico medico) {
        HashMap<Integer, Remedio> opcoes = Data.remedios;
        List<Remedio> remedios = new ArrayList<>();
        switch (medico) {
            case SEGUNDAMANHA -> { remedios.add(opcoes.get(1));
                remedios.add(opcoes.get(5)); }
            case SEGUNDATARDE -> remedios.add(opcoes.get(2));
            case QUARTAMANHA -> remedios.add(opcoes.get(3));
            case QUARTATARDE -> remedios.add(opcoes.get(6));
            case SEXTAMANHA -> { remedios.add(opcoes.get(3));
                remedios.add(opcoes.get(6));}
            case SEXTATARDE -> remedios.add(opcoes.get(4));
        }
        return remedios;
    }
}
