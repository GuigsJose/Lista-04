package br.edu.up;

import br.edu.up.Controller.EstacionamentoController;
import br.edu.up.Models.Estacionamento;
import br.edu.up.Models.Vaga;
import br.edu.up.view.EstacionamentoView;

public class App {
    public static void main(String[] args) throws Exception {
        Vaga[] vagas = new Vaga[10];
        EstacionamentoController controller = new EstacionamentoController("Dia", vagas);
        EstacionamentoView view = new EstacionamentoView(controller);

        view.executar();
    }
}
