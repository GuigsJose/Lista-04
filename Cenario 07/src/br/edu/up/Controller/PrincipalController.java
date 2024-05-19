package br.edu.up.Controller;

import br.edu.up.Model.Aluno;
import br.edu.up.Model.Professor;

public class PrincipalController {
    private ProfessorController profController;
    private AlunoController alunoController;
    private DisciplinaController disciplinaController;
    private SituacaoCompController situacaoController;

    public PrincipalController(int capacidadeProf, int capacidadeAluno, int capacidadeDisciplina, int capacidadeSituacao) {
        this.profController = new ProfessorController(capacidadeProf);
        this.alunoController = new AlunoController(capacidadeAluno);
        this.disciplinaController = new DisciplinaController(capacidadeDisciplina);
        this.situacaoController = new SituacaoCompController(capacidadeSituacao);
    }

    public ProfessorController getProfController() {
        return profController;
    }

    public AlunoController getAlunoController() {
        return alunoController;
    }

    public DisciplinaController getDisciplinaController() {
        return disciplinaController;
    }

    public SituacaoCompController getSituacaoController() {
        return situacaoController;
    }

    //professor
    public void adicionaProfessor(Professor professor){
        profController.adicionarProfessor(professor);
    }

    public void removeProfessor(String matricula){
        profController.removeProfMatricula(matricula);
    }

    public Professor buscaMatricula(String matricula){
        return profController.buscarProfMatricula(matricula);
    }

    //aluno
    public void adicionarAluno(Aluno aluno){
        alunoController.adicionarAluno(aluno);
    }


}
