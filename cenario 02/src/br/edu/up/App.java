package br.edu.up;

import java.text.DecimalFormat;

import br.edu.up.Models.Ponto;

public class App {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.##");

    Ponto pontoUm = new Ponto(0, 0);
    double resultOne = pontoUm.calcularDistanci(2, 5);
    System.out.println(pontoUm.getX() + " - " + pontoUm.getY());
    System.out.println("Resultado " + df.format(resultOne));

    Ponto pontoDois = new Ponto(2, 1);

    double resultTwo = pontoDois.calcularDistanci(pontoUm);
    System.out.println(pontoDois.getX() + " - " + pontoDois.getY());
    System.out.println("Resultado " + df.format(resultTwo));
  }
}
