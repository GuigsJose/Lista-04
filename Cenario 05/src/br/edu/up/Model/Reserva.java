package br.edu.up.Model;

public class Reserva {

    
    private String dataReserva;
    private double valorTotal;
    private Cliente clientes;

    public Reserva(String dataReserva, double valorTotal ) {
        
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }



    public Cliente getClientes() {
        return clientes;
    }



    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    
    
}
