package br.edu.up;

import br.edu.up.Models.Compromisso;
import br.edu.up.Models.Dia;

public class App {
    public static void main(String[] args) {
        Dia dia = new Dia(26);

        Compromisso comp = new Compromisso("Gui", "Faculdade", "Teste", 12);
        Compromisso comp1 = new Compromisso("Lucas", "Posito", "Teste1", 19);

        dia.AdicionarCompromisso(comp);
        // dia.ListarCompromisso();
        dia.AdicionarCompromisso(comp1);

        var teste1 = dia.ConsultarCompromisso(12);

        // dia.ExcluirCompromisso(19);

        dia.ListarCompromisso();
        // System.out.println("teste1 >>" + teste1);

    }
}
