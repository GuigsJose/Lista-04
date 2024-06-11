package br.edu.up.view;


import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;
import br.edu.up.model.*;

import br.edu.up.controller.SeguroController;

public class SeguroView {
    private SeguroController controller;
    private Scanner scanner;

    public SeguroView() {
        this.controller = new SeguroController();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        System.out.println("Digite o tipo de seguro (1: Vida, 2: Veículo): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        // Solicita dados comuns a todos os seguros
        System.out.print("Digite o número da apólice: ");
        String apolice = scanner.nextLine();

        // Verifica se a apólice já existe
        if (controller.localizarSeguro(apolice).isPresent()) {
            System.out.println("A apólice já existe!");
            return;
        }

        System.out.print("Digite o nome do segurado: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do segurado: ");
        String rg = scanner.nextLine();
        System.out.print("Digite o CPF do segurado: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o sexo do segurado (MASCULINO, FEMININO): ");
        Sexo sexo = Sexo.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Digite o telefone do segurado: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o endereço do segurado: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o CEP do segurado: ");
        String cep = scanner.nextLine();
        System.out.print("Digite a cidade do segurado: ");
        String cidade = scanner.nextLine();

        Segurado segurado = new Segurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);

        System.out.print("Digite o valor da apólice: ");
        double valorApolice = scanner.nextDouble();
        System.out.print("Digite a data de início (YYYY-MM-DD): ");
        LocalDate dataInicio = LocalDate.parse(scanner.next());
        System.out.print("Digite a data de fim (YYYY-MM-DD): ");
        LocalDate dataFim = LocalDate.parse(scanner.next());

        Seguro seguro;
        if (tipo == 1) {
            SeguroVida seguroVida = new SeguroVida();
            System.out.print("Cobre doença? (true/false): ");
            boolean cobreDoenca = scanner.nextBoolean();
            System.out.print("Cobre acidente? (true/false): ");
            boolean cobreAcidente = scanner.nextBoolean();

            seguroVida.setCobreDoenca(cobreDoenca);
            seguroVida.setCobreAcidente(cobreAcidente);
            seguro = seguroVida;
        } else {
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
            System.out.print("Digite o valor da franquia: ");
            double valorFranquia = scanner.nextDouble();
            System.out.print("Tem carro reserva? (true/false): ");
            boolean temCarroReserva = scanner.nextBoolean();
            System.out.print("Cobre vidros? (true/false): ");
            boolean cobreVidros = scanner.nextBoolean();

            seguroVeiculo.setVlrFranquia(valorFranquia);
            seguroVeiculo.setTemCarroReserva(temCarroReserva);
            seguroVeiculo.setCobreVidros(cobreVidros);
            seguro = seguroVeiculo;
        }

        seguro.setApolice(apolice);
        seguro.setSegurado(segurado);
        seguro.setVlrApolice(valorApolice);
        seguro.setDataInicio(dataInicio);
        seguro.setDataFim(dataFim);

        if (controller.incluirSeguro(seguro)) {
            System.out.println("Seguro incluído com sucesso.");
        } else {
            System.out.println("Falha ao incluir seguro.");
        }
    }

    private void localizarSeguro() {
        System.out.print("Digite o número da apólice: ");
        String apolice = scanner.nextLine();
        Optional<Seguro> seguro = controller.localizarSeguro(apolice);
        if (seguro.isPresent()) {
            System.out.println(seguro.get());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.print("Digite o número da apólice: ");
        String apolice = scanner.nextLine();
        if (controller.excluirSeguro(apolice)) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (S/N): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            controller.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos.");
        }
    }

    private void listarTodosSeguros() {
        System.out.println("Listando todos os seguros:");
        for (Seguro seguro : controller.listarTodosSeguros()) {
            System.out.println(seguro);
        }
    }

    private void verQuantidadeSeguros() {
        System.out.println("Quantidade de seguros: " + controller.quantidadeSeguros());
    }
}