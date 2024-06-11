package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private Segurado segurado;
    private double vlrApolice;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    
    public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dataInicio, LocalDate dataFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    
}
