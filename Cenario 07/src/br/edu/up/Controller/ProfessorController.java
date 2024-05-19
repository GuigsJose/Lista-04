package br.edu.up.Controller;

import br.edu.up.Model.Professor;

public class ProfessorController {
    private Professor[] professores;
    private int contador;

    public ProfessorController(int capacidade) {
        professores = new Professor[capacidade];
        this.contador = 0;
    }

    public void adicionarProfessor(Professor p){
        if (contador < professores.length) {
            professores[contador++] = p;
        }
    }

    public void removeProfMatricula(String matricula){
        for (int i = 0; i < contador; i++) {
            if (professores[i].getMatricula().equals(matricula)) {
                for (int j = 0; j < contador-1; j++) {
                    professores[j] = professores[j+1];
                }
                contador--;
                return;
            }
        }
    }

    public Professor buscarProfMatricula(String matricula) {
        for (int i = 0; i < contador; i++) {
            if (professores[i].getMatricula().equals(matricula)) {
                return professores[i];
            }
        }
        return null;
    }


    
}
