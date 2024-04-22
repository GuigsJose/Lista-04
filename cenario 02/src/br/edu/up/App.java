package br.edu.up;

import br.edu.up.Models.Ponto;

public class App {
  public static void main(String[] args) {
    Ponto pontoTeste = new Ponto(7, 2);
    String result = pontoTeste.calcularDistanci(2, 5);
    System.out.println(pontoTeste.getX() + pontoTeste.getY());
    System.out.println("Resultado " + result);

    Ponto pontoDois = new Ponto(2, 1);

    String resultado = pontoDois.calcularDistanci(pontoTeste);
    System.out.println(pontoDois.getX() + pontoDois.getY());
    System.out.println("Resultado " + resultado);
  }
}
