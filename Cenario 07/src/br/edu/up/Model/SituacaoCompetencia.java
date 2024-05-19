package br.edu.up.Model;

import java.util.Arrays;

public class SituacaoCompetencia {
    private Aluno aluno;
    private Disciplina disciplina;
    private boolean[] competencias;

    public SituacaoCompetencia(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public boolean[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(boolean[] competencias) {
        this.competencias = competencias;
    }

    @Override
    public String toString() {
        return "SituacaoCompetencia [aluno=" + aluno + ", disciplina=" + disciplina + ", competencias="
                + Arrays.toString(competencias) + "]";
    }
    
    
    
}
