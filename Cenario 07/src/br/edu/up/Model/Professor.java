package br.edu.up.Model;

public class Professor extends Pessoa{

    private String numLattes;
    private String instituicao;
    private int anoConclusao;
    private String titulObtido;
    private String tituloTrabalho;

    public Professor(String nome, String rg, String matricula, String numLattes, String instituicao, int anoConclusao,
            String titulObtido, String tituloTrabalho) {
        super(nome, rg, matricula);
        this.numLattes = numLattes;
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.titulObtido = titulObtido;
        this.tituloTrabalho = tituloTrabalho;
    }

    public String getNumLattes() {
        return numLattes;
    }

    public void setNumLattes(String numLattes) {
        this.numLattes = numLattes;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getTitulObtido() {
        return titulObtido;
    }

    public void setTitulObtido(String titulObtido) {
        this.titulObtido = titulObtido;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }

    

    
}
