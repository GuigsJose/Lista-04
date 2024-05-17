package br.edu.up.Model;

public class Passagem {
    private String numeroAssento;
    private String classeAssento;
    private String dataVoo;


    public Passagem(String numeroAssento, String classeAssento, String dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }


    public String getNumeroAssento() {
        return numeroAssento;
    }


    public String getClasseAssento() {
        return classeAssento;
    }


    public String getDataVoo() {
        return dataVoo;
    }


    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }


    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }


    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
    
}
