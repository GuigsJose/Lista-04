package br.edu.up.Controller;

import br.edu.up.Model.Aluno;
import br.edu.up.Model.Disciplina;
import br.edu.up.Model.SituacaoCompetencia;

public class SituacaoCompController {
    private SituacaoCompetencia[] situacoes;
    private int contador;

    public SituacaoCompController( int capacidade) {
        this.situacoes = new SituacaoCompetencia[capacidade];
        this.contador = 0;
    }
    
    public void adicionarSituacao(SituacaoCompetencia s){
        if (contador < situacoes.length) {
            situacoes[contador++] = s;
        }
    }

    public void removerSituacaoAlunoDisciplina(Aluno a, Disciplina d){
        for (int i = 0; i < contador; i++) {
            if (situacoes[i].getAluno().equals(a) && situacoes[i].getDisciplina().equals(d)) {
                for (int j = 0; j < contador; j++) {
                    situacoes[j] = situacoes[j+1];
                }
                contador--;
                return;
            }
        }
    }

    public SituacaoCompetencia buscarSituacaoAlunoDisciplina(Aluno a, Disciplina d) {
        for (int i = 0; i < contador; i++) {
            if (situacoes[i].getAluno().equals(a) && situacoes[i].getDisciplina().equals(d)) {
                return situacoes[i];
            }
        }
        return null;
    }
}
