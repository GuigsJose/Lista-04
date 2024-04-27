package br.edu.up.Models;

import java.util.List;
import java.util.ArrayList;

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
    for (int i = 0; i < this.Compromissos.size(); i++) {
      Compromisso c = this.Compromissos.get(i);
      if (c.getHora() == hora) {
        this.Compromissos.remove(c);
        break;
      }
    }
  }
}
