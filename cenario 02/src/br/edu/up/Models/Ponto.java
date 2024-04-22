package br.edu.up.Models;

public class Ponto {
  private Double X;
  private Double Y;

  public Ponto(double x, double y) {
    this.X = x;
    this.Y = y;
  }

  public double setX(double x) {
    return this.X = x;
  }

  public double getX() {
    return this.X;
  }

  public double setY(double y) {
    return this.Y = y;
  }

  public double getY() {
    return this.Y;
  }

  public double calcularDistanci(double x, double y) {
    double calcX = Math.pow((x * 1) - (x * 2), 2);
    double calcY = Math.pow((y * 1) - (y * 2), 2);
    double result = Math.sqrt(calcX + calcY);

    return result;
  }
}
