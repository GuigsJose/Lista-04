package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
  private List<Contato> Contatos = new ArrayList<Contato>();

  public Agenda() {
  };

  public void adicionar(Comercial contato) {
    Contatos.add(contato);
  }

  public void adicionar(Pessoal pessoal) {
    Contatos.add(pessoal);
  }

  public List<Contato> getContato(int codigo) {
    return Contatos.stream().filter(x -> x.getCodigo() == codigo).collect(Collectors.toList());
  }

  public void excluirContato(int codigo) {
    Contatos.removeIf(x -> x.getCodigo() == codigo);
  }

  public String listarContatos() {
    return Contatos.toString();
  }
}
