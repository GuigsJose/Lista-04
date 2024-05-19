package br.edu.up.Model;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Competencia[] competencias;
    private Professor[] professor;
    private Aluno[] alunos;


    public Disciplina(String nome, String identificador, String curriculo, Competencia[] competencias,
            Professor[] professor, Aluno[] alunos) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdentificador() {
        return identificador;
    }


    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public String getCurriculo() {
        return curriculo;
    }


    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }


    public Competencia[] getCompetencias() {
        return competencias;
    }


    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }


    public Professor[] getProfessor() {
        return professor;
    }


    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }


    public Aluno[] getAlunos() {
        return alunos;
    }


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
        
}
