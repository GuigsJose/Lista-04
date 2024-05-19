package br.edu.up.Model;

public class Competencia {
    private String descricao;
    private boolean necessario;

    public Competencia(String descricao, boolean necessario) {
        this.descricao = descricao;
        this.necessario = necessario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isNecessario() {
        return necessario;
    }

    public void setNecessario(boolean necessario) {
        this.necessario = necessario;
    }

    
    
}
