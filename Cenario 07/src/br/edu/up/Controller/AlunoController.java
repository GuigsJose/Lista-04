package br.edu.up.Controller;

import br.edu.up.Model.Aluno;

public class AlunoController {

    private Aluno[] alunos;

    private int contador;
    public AlunoController(int capacidade) {
        alunos = new Aluno[capacidade];
        this.contador = 0;
    }

    public void adicionarAluno(Aluno a){
        if (contador < alunos.length) {
            alunos[contador++] = a;        
        }
    }

    public void removerAlunoMatricula(String m){
        for (int i = 0; i < contador; i++) {
            if (alunos[i].getMatricula().equals(m)) {
                for (int j = 0; j < contador; j++) {
                    alunos[j] = alunos[j+1];
                }

                contador--;
                return;
            }
        }
    }

    public Aluno buscarAlunoMatricula(String m) {
        for (int i = 0; i < contador; i++) {
            if (alunos[i].getMatricula().equals(m)) {
                return alunos[i];
            }
        }
        return null;
    }
    
}
