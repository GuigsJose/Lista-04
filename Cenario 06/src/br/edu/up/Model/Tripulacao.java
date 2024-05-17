package br.edu.up.Model;

public class Tripulacao extends Pessoa{
    private String idAeronautica;
    private String matricula;

    public Tripulacao(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula) {
        super(nome, rg, aeronave);
        this.idAeronautica = idAeronautica;
        this.matricula = matricula;
    }

    public String getIdAeronautica() {
        return idAeronautica;
    }

    public void setIdAeronautica(String idAeronautica) {
        this.idAeronautica = idAeronautica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Tripulacao [idAeronautica=" + idAeronautica + ", matricula=" + matricula + "]";
    }

    
    
}
