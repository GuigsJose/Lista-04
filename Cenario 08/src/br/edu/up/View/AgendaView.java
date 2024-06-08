package View;

import java.util.Scanner;

import Controllers.AgendaController;

public class AgendaView {
  private AgendaController agendaController;
  private Scanner sc;

  public void executar() {
    int opcao;
    do {
      System.out.println("\n--- MENU PRINCIPAL ---");
      System.out.println("1. Incluir contato Pessoal");
      System.out.println("2. Incluir contato Comercial");
      System.out.println("3. Remover contato");
      System.out.println("4. Consultar contato");
      System.out.println("5. Listar todos os contatos");
      System.out.println("6. Sair do programa");
      opcao = sc.nextInt();
      sc.nextLine(); // Limpar o buffer do sc

      switch (opcao) {
        case 1:
          IncluirContatoPessoal();
          break;
        case 2:
          IncluirContatoComercial();
          break;
        case 3:
          ExcluirContato();
          break;
        case 4:
          ConsultarContato();
          break;
        case 5:
          ListarContatos();
          break;
        case 6:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (opcao != 6);
  }

  void IncluirContatoPessoal() {
    System.out.println("\n-_-_- Adicionar contato pessoal -_-_-");
    System.out.print("Codigo: ");
    int codigo = sc.nextInt();
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Telefone: ");
    String telefone = sc.nextLine();
    System.out.print("Aniversario");
    String aniversario = sc.nextLine();
    agendaController.AddContatoPessoal(codigo, nome, telefone, aniversario);
    System.out.println("Contato Pessoal adicionado com sucesso!");
  }

  void IncluirContatoComercial() {
    System.out.println("\n-_-_- Adicionar contato comercial -_-_-");
    System.out.print("Codigo: ");
    int codigo = sc.nextInt();
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("telefone: ");
    String telefone = sc.nextLine();
    System.out.print("Cnpj");
    String cnpj = sc.nextLine();
    agendaController.AddContatoComercial(codigo, nome, telefone, cnpj);
    System.out.println("Contato Comercial adicionado com sucesso!");
  }

  void ExcluirContato() {
    System.out.println("\n-_-_- Remover contato -_-_-");
    System.out.print("Codigo: ");
    int codigo = sc.nextInt();
    agendaController.DeleteContato(codigo);
    System.out.println("Contato removido com sucesso!");
  }

  void ConsultarContato() {
    System.out.println("\n-_-_- Consultar contato -_-_-");
    System.out.print("Codigo: ");
    int codigo = sc.nextInt();
    if (agendaController.ConsultarContato(codigo).isEmpty()) {
      System.out.println("Contato não encontrado");
    } else {
      System.out.println("Contato Encontrado: ");
      System.out.println(agendaController.ConsultarContato(codigo));
    }
  }

  void ListarContatos() {
    System.out.println("\n-_-_- Lista de contatos -_-_-");
    agendaController.ListaContatos();
  }
}
