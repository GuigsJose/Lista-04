package br.edu.up.Models;

public class Dia {
  private int DiaMes;
  private int QtdCompromisso = 10;
  private Compromisso[] Compromissos = new Compromisso[this.QtdCompromisso];

  public Dia(int diaMes) {
    this.DiaMes = diaMes;
  }

  public void setDia(int dia) {
    this.DiaMes = dia;
  }

  public int getDia() {
    return this.DiaMes;
  }

  public void AdicionarCompromisso(Compromisso comp) {
    for (int i = 0; i < this.Compromissos.length; i++) {
      if (this.Compromissos[i] != comp) {
        this.Compromissos[i] = comp;
      }
    }
  }

  public Compromisso ConsultarCompromisso(int hora) {
    int index = 0;

    for (int i = 0; i < this.Compromissos.length; i++) {
      if (this.Compromissos[i].getHora() == hora) {
        index = i;

      }
    }
    return this.Compromissos[index];
  }

  public void ExcluirCompromisso(int hora) {
    for (int i = 0; i < this.Compromissos.length; i++) {
      if (this.Compromissos[i].getHora() == hora) {
        this.Compromissos[i] = null;
      }
    }
  }

  public void ListarCompromisso() {
    for (Compromisso comp : this.Compromissos) {
      System.out.println(comp + " ");
    }
  }
}
