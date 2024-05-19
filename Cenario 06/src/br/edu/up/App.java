package br.edu.up;

import br.edu.up.Controller.AeroportoController;
import br.edu.up.View.AeroportoView;

public class App {
    public static void main(String[] args) throws Exception {
        AeroportoController controller = new AeroportoController();
        AeroportoView view = new AeroportoView(controller);
        view.mostrarMenu();
    }
}
