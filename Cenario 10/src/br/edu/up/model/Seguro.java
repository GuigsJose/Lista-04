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


    public String getApolice() {
        return apolice;
    }


    public void setApolice(String apolice) {
        this.apolice = apolice;
    }


    public Segurado getSegurado() {
        return segurado;
    }


    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }


    public double getVlrApolice() {
        return vlrApolice;
    }


    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    
}
