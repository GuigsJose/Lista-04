package br.edu.up;
import br.edu.up.Controller.EventoController;
import br.edu.up.View.EventoView;

public class App {
    public static void main(String[] args) throws Exception {
        EventoController controller= new EventoController();
        EventoView view = new EventoView(controller);
        
        view.executar();
    }
}
