package Models;

public class Estacionamento {

    private Carro[] carros;

    private Vaga[] vagas = new Vaga[10];

    private String periodo;

    public Estacionamento(String periodo, Vaga[] vagas){
        this.periodo = periodo;
        this.vagas = vagas;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public String getPeriodo() {
        return periodo;
    }

    public Vaga[] getVagas(){
        return vagas;
    }

    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    

}
