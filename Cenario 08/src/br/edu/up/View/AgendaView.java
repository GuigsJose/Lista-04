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
          adicionarProfessor();
          break;
        case 2:
          buscarProfessor();
          break;
        case 3:
          removerProfessor();
          break;
        case 4:
          adicionarAluno();
          break;
        case 5:
          buscarAluno();
          break;
        case 6:
          removerAluno();
          break;
        case 10:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (opcao != 6);
  }

  void IncluirContatoPessoal() {

  }
}
