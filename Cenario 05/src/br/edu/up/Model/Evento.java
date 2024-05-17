package br.edu.up.Model;

public class Evento {
    
    private String nomeEvento;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;
    private Reserva[] reservas;
    private int numReservas;


    public Evento(String nomeEvento, String data, String local, int lotacaoMaxima, int ingressosVendidos,
            double precoIngresso, Reserva[] reservas, int numReservas) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.ingressosVendidos = ingressosVendidos;
        this.precoIngresso = precoIngresso;
        this.reservas = reservas;
        this.numReservas = numReservas;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }


    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    public String getLocal() {
        return local;
    }


    public void setLocal(String local) {
        this.local = local;
    }


    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }


    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }


    public int getIngressosVendidos() {
        return ingressosVendidos;
    }


    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }


    public double getPrecoIngresso() {
        return precoIngresso;
    }


    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }


    public Reserva[] getReservas() {
        return reservas;
    }


    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }


    public int getNumReservas() {
        return numReservas;
    }


    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    public void adicionaReservaEvento(Reserva reserva){
        if(numReservas < reservas.length){
            reservas[numReservas] = reserva;
            numReservas++;
        }
    }   

}
