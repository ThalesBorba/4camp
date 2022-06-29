package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

import java.util.HashMap;
import java.util.List;

public class Data {

    private static HashMap<Integer, Remedio> remedios;
    private static List<Receita> receitas;

    public static void populateRemedios() {
        Remedio remedio1 = new Remedio("Rivotril", true);
        Remedio remedio2 = new Remedio("Paracetamol", false);
        Remedio remedio3 = new Remedio("Pantoprazol", false);
        Remedio remedio4 = new Remedio("Oxicodona", true);
        Remedio remedio5 = new Remedio("Diazepam", true);
        Remedio remedio6 = new Remedio("Dipirona", false);
        remedios.put(1, remedio1);
        remedios.put(2, remedio2);
        remedios.put(3, remedio3);
        remedios.put(4, remedio4);
        remedios.put(5, remedio5);
        remedios.put(6, remedio6);
    }

    public static String prescreveReceita(Receita receita, String paciente, String convenio) {
        receitas.add(receita);
        return "Paciente: " + paciente + "\nConvênio: " + convenio +  "\n\n " + receita.toString();
    }
}
