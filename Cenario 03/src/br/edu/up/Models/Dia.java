package br.edu.up.Models;

import java.util.List;
import java.util.ArrayList;

public class Dia {
  private int DiaMes;
  private List<Compromisso> Compromissos = new ArrayList<Compromisso>();

  public Dia(int diaMes) {
    this.DiaMes = diaMes;
  }

  public void AdicionarCompromisso(Compromisso comp) {
    this.Compromissos.add(comp);
  }

  public Compromisso ConsultarCompromisso(int hora) {

    return this.Compromissos.stream().filter(x -> {
      return x.getHora() == hora;
    }).findAny().orElse(null);

  }

  // public void ExcluirCompromisso(int hora) {
  // this.Compromissos.indexOf(Compromissos);
  // }
}
