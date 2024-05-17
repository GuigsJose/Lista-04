package br.edu.up.Model;

public class Comandante extends Tripulacao{

    private int horasVoo;

    public Comandante(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula, int horasVoo) {
        super(nome, rg, aeronave, idAeronautica, matricula);
        this.horasVoo = horasVoo;
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }
    
    
}
