package br.edu.up.Model;

public class SituacaoCompetencia {
    private Aluno aluno;
    private Disciplina disciplina;
    private boolean[] competencias;

    public SituacaoCompetencia(Aluno aluno, Disciplina disciplina, boolean[] competencias) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.competencias = competencias;
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
    
    
    
}
