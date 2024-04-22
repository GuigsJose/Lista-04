package br.edu.up.Models;

import java.text.DecimalFormat;

public class Ponto {
  private Double X;
  private Double Y;

  public Ponto(double x1, double y1) {
    this.X = x1;
    this.Y = y1;
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

  public String calcularDistanci(double x2, double y2) {
    double calcX = Math.pow(this.X - x2, 2);
    double calcY = Math.pow(this.Y - y2, 2);
    double result = Math.sqrt(calcX + calcY);

    DecimalFormat df = new DecimalFormat("#.##");

    return df.format(result);
  }
}
