package br.edu.up.Model;

public class Pessoa {

    private String nome;
    private String rg;
    private Aeronave aeronave;

    public Pessoa(String nome, String rg, Aeronave aeronave){
        this.nome = nome;
        this.rg = rg;
        this.aeronave = aeronave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", rg=" + rg + ", aeronave=" + aeronave + "]";
    }
    
}
