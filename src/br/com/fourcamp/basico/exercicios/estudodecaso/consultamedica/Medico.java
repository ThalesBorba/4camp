package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

public enum Medico {

    SEGUNDAMANHA(1, "Paulo Rottentowski"),
    SEGUNDATARDE(2, "Maria Pololova"),
    QUARTAMANHA(3, "Sergio Fillardis"),
    QUARTATARDE(4, "Antônia Bragança"),
    SEXTAMANHA(5, "Carlos Farias"),
    SEXTATARDE(6, "Roberto Mattarazzo");


    private int identicador;
    private String nome;

    Medico(int identicador, String nome) {
    }
}
