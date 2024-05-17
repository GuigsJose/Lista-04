package br.edu.up.Model;

import java.util.Arrays;

public class Comissario extends Tripulacao{
    private String[] idiomas;

    public Comissario(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula,
            String[] idiomas) {
        super(nome, rg, aeronave, idAeronautica, matricula);
        this.idiomas = idiomas;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Comissario [idiomas=" + Arrays.toString(idiomas) + "]";
    }
    

}
