

import Controller.ClienteController;
import View.PrincipalView;

public class App {
    public static void main(String[] args) throws Exception {
        ClienteController controller = new ClienteController();
        PrincipalView view = new PrincipalView(controller);
        view.mostrarMenu();
    }
}
