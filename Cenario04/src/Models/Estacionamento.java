package Models;

public class Estacionamento {


    private Vaga[] vagas = new Vaga[10];

    public void setVagas(Vaga[] vagas) {
        this.vagas = vagas;
    }

    private String periodo;

    public Estacionamento(String periodo, Vaga[] vagas){
        this.periodo = periodo;
        this.vagas = vagas;
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
