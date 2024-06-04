package Controllers;

import java.util.List;

import Models.Agenda;
import Models.Comercial;
import Models.Contato;
import Models.Pessoal;

public class AgendaController {
  Agenda agenda = new Agenda();

  public void AddContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
    Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
    agenda.adicionar(pessoal);
  }

  public void AddContatoComercial(int codigo, String nome, String telefone, String cnpj) {
    Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
    agenda.adicionar(comercial);
  }

  public void DeleteContato(int codigo) {
    agenda.excluirContato(codigo);
  }

  public List<Contato> ConsultarContato(int codigo) {
    return agenda.getContato(codigo);
  }

  public String ListaContatos() {
    return agenda.listarContatos();
  }
}
