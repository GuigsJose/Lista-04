import Controller.EstacionamentoController;
import Models.Estacionamento;
import Models.Vaga;
import view.EstacionamentoView;

public class App {
    public static void main(String[] args) throws Exception {
        Vaga[] vagas = new Vaga[10];
        EstacionamentoController controller = new EstacionamentoController("Dia", vagas);
        EstacionamentoView view = new EstacionamentoView(controller);

        view.executar();
    }
}
