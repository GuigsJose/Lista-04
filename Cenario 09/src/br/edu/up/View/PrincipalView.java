package View;

import Controller.ClienteController;
import Model.ClienteEmpresa;
import Model.ClientePessoa;
import java.util.Scanner;

public class PrincipalView {
    private Scanner scanner;
    private ClienteController controller;

    public PrincipalView(ClienteController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolverClientePessoa();
                    break;
                case 8:
                    devolverClienteEmpresa();
                    break;
                case 9:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }

    private void incluirClientePessoa() {
        String nome = solicitarInformacao("Nome: ");
        String telefone = solicitarInformacao("Telefone: ");
        String email = solicitarInformacao("Email: ");
        String cpf = solicitarInformacao("CPF: ");
        double peso = solicitarValor("Peso: ");
        double altura = solicitarValor("Altura: ");
        controller.incluirClientePessoa(nome, telefone, email, cpf, peso, altura);
        mostrarMensagem("Cliente pessoa incluído com sucesso.");
    }

    private void incluirClienteEmpresa() {
        String nome = solicitarInformacao("Nome: ");
        String telefone = solicitarInformacao("Telefone: ");
        String email = solicitarInformacao("Email: ");
        String cnpj = solicitarInformacao("CNPJ: ");
        String inscEstadual = solicitarInformacao("Inscrição Estadual: ");
        int anoFundacao = (int)solicitarValor("Ano de Fundação: ");
        controller.incluirClienteEmpresa(nome, telefone, email, cnpj, inscEstadual, anoFundacao);
        mostrarMensagem("Cliente empresa incluído com sucesso.");
    }

    private void mostrarDadosClientePessoa() {
        for (ClientePessoa cliente : controller.getClientesPessoas()) {
            mostrarMensagem("Nome: " + cliente.getNome());
            mostrarMensagem("Telefone: " + cliente.getTelefone());
            mostrarMensagem("Email: " + cliente.getEmail());
            mostrarMensagem("CPF: " + cliente.getCpf());
            mostrarMensagem("Peso: " + cliente.getPeso());
            mostrarMensagem("Altura: " + cliente.getAltura());
            mostrarMensagem("Valor Emprestado: " + cliente.getVlrEmprestado());
            mostrarMensagem("Valor Máximo de Crédito: " + cliente.getVlrMaxCredito());
            System.out.println();
        }
    }

    private void mostrarDadosClienteEmpresa() {
        for (ClienteEmpresa cliente : controller.getClientesEmpresas()) {
            mostrarMensagem("Nome: " + cliente.getNome());
            mostrarMensagem("Telefone: " + cliente.getTelefone());
            mostrarMensagem("Email: " + cliente.getEmail());
            mostrarMensagem("CNPJ: " + cliente.getCnpj());
            mostrarMensagem("Inscrição Estadual: " + cliente.getInscEstadual());
            mostrarMensagem("Ano de Fundação: " + cliente.getAnoFundacao());
            mostrarMensagem("Valor Emprestado: " + cliente.getVlrEmprestado());
            mostrarMensagem("Valor Máximo de Crédito: " + cliente.getVlrMaxCredito());
            System.out.println();
        }
    }

    private void emprestarParaClientePessoa() {
        int index = (int)solicitarValor("Índice do cliente: ");
        double valor = solicitarValor("Valor a emprestar: ");
        try {
            controller.emprestarParaClientePessoa(index, valor);
            mostrarMensagem("Empréstimo realizado com sucesso.");
        } catch (Exception e) {
            mostrarMensagem("Erro: " + e.getMessage());
        }
    }

    private void emprestarParaClienteEmpresa() {
        int index = (int)solicitarValor("Índice do cliente: ");
        double valor = solicitarValor("Valor a emprestar: ");
        try {
            controller.emprestarParaClienteEmpresa(index, valor);
            mostrarMensagem("Empréstimo realizado com sucesso.");
        } catch (Exception e) {
            mostrarMensagem("Erro: " + e.getMessage());
        }
    }

    private void devolverClientePessoa() {
        int index = (int)solicitarValor("Índice do cliente: ");
        double valor = solicitarValor("Valor a devolver: ");
        try {
            controller.devolverClientePessoa(index, valor);
            mostrarMensagem("Devolução realizada com sucesso.");
        } catch (Exception e) {
            mostrarMensagem("Erro: " + e.getMessage());
        }
    }

    private void devolverClienteEmpresa() {
        int index = (int)solicitarValor("Índice do cliente: ");
        double valor = solicitarValor("Valor a devolver: ");
        try {
            controller.devolverClienteEmpresa(index, valor);
            mostrarMensagem("Devolução realizada com sucesso.");
        } catch (Exception e) {
            mostrarMensagem("Erro: " + e.getMessage());
        }
    }

    private String solicitarInformacao(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private double solicitarValor(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    private void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
