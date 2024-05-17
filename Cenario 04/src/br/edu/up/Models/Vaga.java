package br.edu.up.Models;

public class Vaga {
    private boolean disponivel = true;
    private int localVaga;
    private Carro carro;
    private String periodo;
    private double tarifa;
    private boolean pago = false;

    public Vaga(Carro carro, int vaga, String periodo) {
        this.carro = carro;
        this.localVaga = vaga;
        this.periodo = periodo;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setLocalVaga(int vaga) {
        this.localVaga = vaga;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setPeriodo(String periodo) {
        this.carro = carro;
    }

    public void setPagamento(boolean pago) {
        this.pago = pago;
    }

    public double tarifa() {
        return this.tarifa;
    }

    public boolean getPagamento() {
        return this.pago;
    }

    public Carro getCarros() {
        return this.carro;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public int getLocalVaga() {
        return this.localVaga;
    }
}
