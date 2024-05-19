package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.AeroportoController;
import br.edu.up.Model.Aeronave;
import br.edu.up.Model.Passagem;
import br.edu.up.Model.Pessoa;

public class AeroportoView {
    private AeroportoController controller;
    private Scanner sc;

    public AeroportoView(AeroportoController controller){
        this.controller = controller;
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao = 0;

        do {
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulação");
            System.out.println("3. Adicionar Aeronave");
            System.out.println("4. Adicionar Passagem");
            System.out.println("5. Listar Pessoas");
            System.out.println("6. Listar Aeronaves");
            System.out.println("7. Listar Passagens");
            System.out.println("10. Remover Aeronave por Código");
            System.out.println("11. Remover Passagem");
            System.out.println("12. Sair");

            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulacao();
                    break;
                case 3:
                    adicionarAeronave();
                    break;
                case 4:
                    adicionarPassagem();
                    break;
                case 5:
                    listarPessoas();
                    break;
                case 6:
                    listarAeronaves();
                    break;
                case 7:
                    listarPassagens();
                    break;
                case 10:
                    removerAeronavePorCodigo();
                    break;
                case 11:
                    removerPassagem();
                    break;
                case 12:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 12);
    }

    private void adicionarPassageiro() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Código da Aeronave: ");
        String codigoAeronave = sc.nextLine();
        
        System.out.print("Tipo da Aeronave: ");
        String tipoAeronave = sc.nextLine();
        
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = sc.nextInt();
        sc.nextLine();  // Consumir a nova linha

        Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, quantidadeAssentos);

        System.out.print("ID Bagagem: ");
        String idBagagem = sc.nextLine();

        System.out.print("Número do Assento: ");
        String numeroAssento = sc.nextLine();

        System.out.print("Classe do Assento: ");
        String classeAssento = sc.nextLine();

        System.out.print("Data do Voo (dd/MM/yyyy HH:mm): ");
        String dataVoo = sc.nextLine();

        Passagem passagem = new Passagem(numeroAssento, classeAssento, dataVoo);
        controller.adicionarPassageiro(nome, rg, aeronave, idBagagem, passagem);
        System.out.println("Passageiro adicionado com sucesso.");
    }

    private void adicionarTripulacao() {
        System.out.print("Nome: ");
        String nome =   sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Código da Aeronave: ");
        String codigoAeronave = sc.nextLine();
        
        System.out.print("Tipo da Aeronave: ");
        String tipoAeronave =   sc.nextLine();
        
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos =    sc.nextInt();
        sc.nextLine();  

        Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, quantidadeAssentos);

        System.out.print("ID Aeronáutica: ");
        String idAeronautica =  sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula =  sc.nextLine();

        System.out.print("Tipo de Tripulação (1- Comandante, 2- Comissário): ");
        int tipoTripulacao = sc.nextInt();
        sc.nextLine();  

        if (tipoTripulacao == 1) {
            System.out.print("Horas de Voo: ");
            int horasVoo = sc.nextInt();
            sc.nextLine(); 

            controller.adicionarComandante(nome, rg, aeronave, idAeronautica, matricula, horasVoo);
            System.out.println("Comandante adicionado com sucesso.");
        } else if (tipoTripulacao == 2) {
            System.out.print("Idiomas (separados por vírgula): ");
            String idiomasStr = sc.nextLine();
            String[] idiomas = idiomasStr.split(",\\s*");

            controller.adicicionarComissario(nome, rg, aeronave, idAeronautica, matricula, idiomas);
            System.out.println("Comissário adicionado com sucesso.");
        } else {
            System.out.println("Tipo de Tripulação inválido.");
        }
    }

    private void adicionarAeronave() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = sc.nextInt();
        sc.nextLine(); 

        controller.adicionarAeronaves(codigo, tipo, quantidadeAssentos);
        System.out.println("Aeronave adicionada com sucesso.");
    }

    private void adicionarPassagem() {
        System.out.print("Número do Assento: ");
        String numeroAssento = sc.nextLine();

        System.out.print("Classe do Assento: ");
        String classeAssento = sc.nextLine();

        System.out.print("Data do Voo (dd/MM/yyyy HH:mm): ");
        String dataVoo = sc.nextLine();

        controller.adicionarPassagens(numeroAssento, classeAssento, dataVoo);
        System.out.println("Passagem adicionada com sucesso.");
    }

    private void listarPessoas() {
        Pessoa[] pessoas = controller.listarPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }

    private void listarAeronaves() {
        Aeronave[] aeronaves = controller.listarAeronaves();
        for (Aeronave aeronave : aeronaves) {
            System.out.println(aeronave.toString());
        }
    }

    private void listarPassagens() {
        Passagem[] passagens = controller.listarPassagens();
        for (Passagem passagem : passagens) {
            System.out.println(passagem.toString());
        }
    }


    private void removerAeronavePorCodigo() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        controller.removerAeronavePorCodigo(codigo);
        System.out.println("Aeronave removida com sucesso.");
    }

    private void removerPassagem() {
        System.out.print("Número do Assento: ");
        String numeroAssento = sc.nextLine();

        System.out.print("Classe do Assento: ");
        String classeAssento = sc.nextLine();

        System.out.print("Data do Voo (dd/MM/yyyy HH:mm): ");
        String dataVoo =    sc.nextLine();

        controller.removerPassagem(numeroAssento, classeAssento, dataVoo);
        System.out.println("Passagem removida com sucesso.");
    }
}
