package br.edu.up.Controller;

import br.edu.up.Model.Disciplina;

public class DisciplinaController {
    private Disciplina[] disciplinas;
    private int contador;

    public DisciplinaController( int capacidade) {
        this.disciplinas = new Disciplina[capacidade];
        this.contador = 0;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        if (contador < disciplinas.length) {
            disciplinas[contador++] = disciplina;
        }
    }

    public void removerDisciplina(String identificador){
        for (int i = 0; i < contador; i++) {
            if (disciplinas[i].getIdentificador().equals(identificador)) {
                for (int j = 0; j < contador; j++) {
                    disciplinas[j] = disciplinas[j+1];
                }
                contador--;
                return;
            }
        }
    }

    public Disciplina buscarDisciplina(String identificador) {
        for (int i = 0; i < contador; i++) {
            if (disciplinas[i].getIdentificador().equals(identificador)) {
                return disciplinas[i];
            }
        }
        return null;
    }
}
