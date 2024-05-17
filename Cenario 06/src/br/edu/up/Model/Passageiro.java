package br.edu.up.Model;

public class Passageiro extends Pessoa {
    private String idBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg,Aeronave aeronave, String idBagagem, Passagem passagem){
        super(nome, rg, aeronave);
        this.idBagagem = idBagagem;
        this.passagem = passagem;
    }

    public String getIdBagagem() {
        return idBagagem;
    }

    public void setIdBagagem(String idBagagem) {
        this.idBagagem = idBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    
}
