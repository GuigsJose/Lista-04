package Models;

public class Estacionamento {

    private Vaga[] vagas = new Vaga[10];

    public void setVaga(Vaga vaga) {
        this.vagas[vaga.getLocalVaga()] = vaga;
    }

    public Vaga getVagas(int localVaga) {
        return this.vagas[localVaga];
    }

}
