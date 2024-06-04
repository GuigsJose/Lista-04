package Models;

public class Comercial extends Contato {
  private String Cnpj;

  public Comercial(int codigo, String nome, String telefone, String cnpj) {
    super(codigo, nome, telefone);
    Cnpj = cnpj;
  }

  public String getAniversario() {
    return Cnpj;
  }

  public void setCnpj(String cnpj) {
    Cnpj = cnpj;
  }

}
