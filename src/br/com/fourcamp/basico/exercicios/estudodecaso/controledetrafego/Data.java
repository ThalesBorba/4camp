package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Aeronave> aeronaveList = new ArrayList<>();
    public static List<PlanoDeVoo> planoList = new ArrayList<>();

    public static void salvaAeronave(String matricula, String cor, String modelo) {
        Aeronave aeronave = new Aeronave(matricula, cor,modelo);
        aeronaveList.add(aeronave);
    }

    public static Aeronave recuperaAeronave(String matricula) {
        for (Aeronave aeronave : aeronaveList) {
            if (aeronave.getMatricula().equals(matricula)) {
                return aeronave;
            }
        } return null;
    }

    public static void salvaPlanoDeVoo(Aeronave aeronave, Integer horario, String localSaida, String localDestino) {
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(aeronave, horario, localSaida, localDestino);
        planoList.add(planoDeVoo);
    }
}
