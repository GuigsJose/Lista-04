package br.edu.up.Models;

public class Ano {
  private int Ano;
  private boolean Bissexto;
  private Mes Meses[] = new Mes[12];

  public Ano(int ano, boolean bissexto) {
    this.Ano = ano;
    this.Bissexto = bissexto;
  }

  public void AdicionarMes(Mes mes) {
    for (int i = 0; i < this.Meses.length; i++) {
      if (this.Meses[i] != mes) {
        this.Meses[i] = mes;
        this.Meses[i].setQtdeDias(this.Bissexto && mes.getNome() == "Fevereiro" ? 29 : 28);
        break;
      }
    }
  }

  public void ExcluirCompromisso(String nomeMes, int diasMes, int hora) {
    for (int i = 0; i < this.Meses.length; i++) {
      if (this.Meses[i].getNome() == nomeMes) {

        for (int j = 0; j < this.Meses[i].getDias().length; j++) {
          if (this.Meses[i].getDias()[j].getDia() == diasMes) {

            this.Meses[i].ExcluirCompromisso(diasMes, hora);
            break;
          }
        }
        break;
      }
    }
  }

  public String ListarCompromissos(String nomeMes) {
    String lista = "";
    for (int i = 0; i < this.Meses.length; i++) {
      if (this.Meses[i].getNome() == nomeMes) {
        lista = this.Meses[i].ListarCompromisso().toString();
        break;
      }
    }
    return lista;
  }

  public String ListarCompromissos() {
    String lista = "";
    for (int i = 0; i < this.Meses.length; i++) {
      lista = this.Meses[i].ListarCompromisso().toString();
    }
    return lista;
  }
}
