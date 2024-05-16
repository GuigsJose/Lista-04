package Controller;

import Model.Evento;

public class EventoController {
    private Evento[] eventos;
    private int numEventos;

    public void adicionarEvento(Evento evento){
        if(numEventos < eventos.length){
            eventos[numEventos] = evento;
            numEventos++;
        }
    }

    public void removeEvento(String nomeEvento){
        boolean encontrar = false;
        for (int i = 0; i < numEventos; i++) {
            if (eventos[i].getNomeEvento().equals(nomeEvento)) {
                
                for (int j = 0; j < numEventos; j++) {
                    eventos[j] = eventos[j+1];
                }
                eventos[numEventos -1]=null;
                numEventos--;
                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            String nao = "nao encontrado";
        }
    }

    public Evento[] listar(){
        Evento[] eventosV = new Evento[numEventos];
        for (int i = 0; i < numEventos; i++) {
            eventosV[i] = eventos[i];
        }
        return eventosV;
    }

    

}
