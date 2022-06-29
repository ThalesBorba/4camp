package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

import java.util.List;

public class Receita {

    private static Integer superID;
    private Integer id;
    private String medico;
    private List<Remedio> remedios;
    private String identificador;

    public String setIdentificador(List<Remedio> remedios) {
        for (Remedio remedio: remedios) {
            if (remedio.getIsControlado()) {
                return "Controlada";
            }
        } return  "Não controlada";
    }

    public Receita(String medico, List<Remedio> remedios) {
        superID++;
        this.id = superID;
        this.medico = medico;
        this.remedios = remedios;
        this.identificador = setIdentificador(remedios);
    }
}
