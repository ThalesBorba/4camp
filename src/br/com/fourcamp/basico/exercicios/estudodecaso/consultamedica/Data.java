package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

import java.util.HashMap;
import java.util.List;

public class Data {

    private static HashMap<Integer, Remedio> remedios;
    private static List<Receita> receitas;

    public static void populateRemedios() {
        
    }

    public static String prescreveReceita(Receita receita, String paciente) {
        receitas.add(receita);
        return "Paciente: " + paciente + "\n\n " + receita.toString();
    }
}
