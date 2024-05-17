package br.edu.up.Models;

public class Carro{
    private String modelo;
    private String placa;
    private String cor;

    public Carro(String modelo,String placa,String cor){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    
    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getCor(){
        return cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }   

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    
    
}