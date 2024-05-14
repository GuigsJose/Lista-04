package Controller;

import Models.Carro;
import Models.Estacionamento;
import Models.Vaga;

public class EstacionamentoController {

  Estacionamento estacionamento1 = new Estacionamento();

  public String Estacionar(String modelo, String placa, String cor, int localVaga, String periodo) {

    Carro carro = new Carro(modelo, placa, cor);
    Vaga vaga = new Vaga(carro, localVaga, periodo);

    if (estacionamento1.getVagas(localVaga).getDisponivel()) {
      estacionamento1.setVaga(vaga);
      estacionamento1.getVagas(localVaga).setDisponivel(false);
      vaga.setPeriodo(periodo);
      return "Carro estacionado com sucesso";
    } else {
      return "Vaga não disponivel";
    }
  }

  // TODO carro, posição dele, disponivel pra = true
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

}
