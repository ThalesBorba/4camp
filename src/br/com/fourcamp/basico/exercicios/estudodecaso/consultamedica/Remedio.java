package br.com.fourcamp.basico.exercicios.estudodecaso.consultamedica;

public class Remedio {

    private String nome;
    private Boolean isControlado;

    public Boolean getIsControlado() {
        return isControlado;
    }

    public String getNome() {
        return nome;
    }

    public Remedio(String nome, Boolean isControlado) {
        this.nome = nome;
        this.isControlado = isControlado;
    }
}
