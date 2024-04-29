package br.edu.up.Models;

public class Mes {
    private String Nome;
    private int qtdeDias;
    private Dia[] dias = new Dia[31];

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.Nome = nome;
    }

    public void AdicionarDia(Dia dia) {
        for (int i = 0; i < this.dias.length; i++) {
            if (this.dias[i] != dia) {
                this.dias[i] = dia;
            }
        }
    }

    public void AdicionarCompromisso(Compromisso comp, int diaMes) {
        for (int i = 0; i < dias.length; i++) {
            if (this.dias[i].getDia() == diaMes) {
                this.dias[i].AdicionarCompromisso(comp);
                break;
            }
        }
    }

    // GET e SET
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

}
