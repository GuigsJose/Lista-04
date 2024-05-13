package Models;

public class Vaga {
    private boolean disponivel;
    private int vaga;

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    
    public void setVaga(int vaga){
        this.vaga = vaga;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    public int getVaga(){
        return this.vaga;
    }

}
