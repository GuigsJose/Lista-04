package br.edu.up;

import br.edu.up.Controller.PrincipalController;
import br.edu.up.View.InstituicaoView;

public class App {
    public static void main(String[] args) throws Exception {
        PrincipalController controller = new PrincipalController(15, 200, 20, 3);
        InstituicaoView view = new InstituicaoView(controller);

        view.executar();
    }  
}
