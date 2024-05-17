package br.edu.up.Controller;

import br.edu.up.Models.Carro;
import br.edu.up.Models.Estacionamento;
import br.edu.up.Models.Vaga;

public class EstacionamentoController {

  private Estacionamento estacionamento1;
  public EstacionamentoController(String periodo, Vaga[] vagas){
    this.estacionamento1 = new Estacionamento(periodo, vagas);
  }

  public String Estacionar(String modelo, String placa, String cor, int localVaga, String periodo) {

    Carro carro = new Carro(modelo, placa, cor);
    Vaga vaga = new Vaga(carro, localVaga, periodo);

    if (estacionamento1.getVagas(localVaga).getDisponivel()) {
      estacionamento1.setVagas(vaga,localVaga);
      estacionamento1.getVagas(localVaga).setDisponivel(false);
      vaga.setPeriodo(periodo);
      return "Carro estacionado com sucesso";
    } else {
      return "Vaga não disponivel";
    }
  }

  
  public String RetirarCarro(int localVaga, String periodo, double valorTarifa) {
    double tarifaValor = periodo.split(",").length * valorTarifa;
    estacionamento1.getVagas(localVaga).setTarifa(tarifaValor);

    Pagar(tarifaValor, localVaga);

    if (estacionamento1.getVagas(localVaga).getPagamento()) {
      estacionamento1.getVagas(localVaga).setDisponivel(true);
      return "Carro retirado";
    } else {
      return "Realizar pagamento da tarifa do estacionamento";
    }

  }

  public String Pagar(double valor, int localVaga) {
    estacionamento1.getVagas(localVaga).setPagamento(true);
    return "O valor ser pago " + valor;
  }

  //emissão de relatórios
  public String EmitirRelatorio(){
    int carrosEntraram = 0;
    Carro[] carrosEstacionados = new Carro[estacionamento1.getVagas().length]; // guarda os carros estacionados

    int[] periodoCarro = new int[estacionamento1.getVagas().length]; // guarda o periodo dos carros

    double valorTotalTarifas = 0.0;

    //percorre as vagas
    for (Vaga vaga : estacionamento1.getVagas()) {
      if (vaga != null && !vaga.getDisponivel()) {
        Carro carro = vaga.getCarros();
        String periodo = vaga.getPeriodo();

        carrosEstacionados[carrosEntraram] = carro; // add no vetor de carro estacionado
        carrosEntraram++; 

        //conta os periodos
        for (int i = 0; i < carrosEntraram; i++) {
          if (carrosEstacionados[i] == carro) {
            periodoCarro[i]++;
            break;
          }
        }

        // calcula o valor da tarifa
        double valorTarifas = vaga.tarifa();
        valorTotalTarifas += valorTarifas;

      }
    }

    // constroi o relatorio utilizando a classe STRINGBUILDER, manipulando os dados dinamicamente
    StringBuilder relatorio = new StringBuilder();

    relatorio.append("Relatório do estacionamento \n");
    relatorio.append("Número de carros que entraram: ").append(carrosEntraram).append("\n");
    relatorio.append("Periodos por carro: \n");

    for (int i = 0; i < carrosEntraram; i++) {
      relatorio.append(" Carro ").append(carrosEstacionados[i].getModelo())
      .append(" Placa: ").append(carrosEstacionados[i].getPlaca())
      .append(" : ").append(periodoCarro[i]).append( " periodos \n");
    }

    relatorio.append("Valor total de tarifas no dia: R$").append(valorTotalTarifas);

    return relatorio.toString();


  }


}
