package br.edu.up;

import br.edu.up.Models.Compromisso;
import br.edu.up.Models.Dia;
import br.edu.up.Models.Mes;

public class App {
    public static void main(String[] args) {

        Compromisso comp = new Compromisso("Gui", "Faculdade", "Teste", 12);
        Compromisso comp1 = new Compromisso("Lucas", "Posito", "Teste1", 19);
        Dia dia = new Dia(26);

        dia.AdicionarCompromisso(comp);
        dia.AdicionarCompromisso(comp1);

        var teste = dia.ConsultarCompromisso(19);

        System.out.println("teste >>" + teste);

       
    }
}
