package br.edu.up.Models;

public class Estacionamento {


    private Vaga[] vagas = new Vaga[10];

    public void setVagas(Vaga vaga, int localVaga) {
        vagas[localVaga] = vaga;
    }

    private String periodo;

    public Estacionamento(String periodo, Vaga[] vagas){
        this.periodo = periodo;
        this.vagas = vagas;
    }

    public Estacionamento(){
        this.vagas = new Vaga[10];
    }


    public String getPeriodo() {
        return periodo;
    }

    public Vaga getVagas(int localVaga){
        if (localVaga >=0 && localVaga < vagas.length) {
            return vagas[localVaga];
        }else{
            return null;
        }

    }

    public Vaga[] getVagas(){
        return this.vagas;
    }

    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }


}
