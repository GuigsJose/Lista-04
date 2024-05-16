package View;

import java.util.Scanner;

import Controller.EventoController;
import Model.Evento;
import Model.Reserva;


public class EventoView {
    private EventoController controller;
    private Scanner sc;

    public EventoView(EventoController controller){
        this.controller = controller;
        this.sc = new Scanner(System.in);
    }
    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    adicionarReserva();
                    break;
                case 3:
                    listarEventos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }


    private void exibirMenu() {
        System.out.println("_-_-_ Menu _-_-_");
        System.out.println("1. Adicionar Evento");
        System.out.println("2. Adicionar Reserva");
        System.out.println("3. Listar Eventos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarEvento(){
         System.out.println("\n-_-_- Adicionar Evento -_-_-");
        System.out.print("Nome do Evento: ");
        String nome = sc.nextLine();
        System.out.print("Data do Evento (dd/MM/yyyy): ");
        String data = sc.nextLine();
        System.out.print("Local do Evento: ");
        String local = sc.nextLine();
        System.out.print("Lotação Máxima: ");
        int lotacaoMaxima = sc.nextInt();
        System.out.print("Preço do Ingresso: ");
        double precoIngresso = sc.nextDouble();
        System.out.println("Reservas: ");
        int reservas = sc.nextInt();

        Evento novo = new Evento(nome, data, local, lotacaoMaxima, lotacaoMaxima, precoIngresso, null, lotacaoMaxima);
        controller.adicionarEvento(novo);
        System.out.println("Evento adicionado com sucesso!\n");
    }
     private void adicionarReserva() {
        System.out.println("\n-_-_- Adicionar Reserva -_-_-");
        System.out.print("Nome do Evento: ");
        String nomeEvento = sc.nextLine();
        System.out.print("Nome do Responsável pela Reserva: ");
        String responsavel = sc.nextLine();
        System.out.print("Quantidade de Pessoas: ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine(); 

        Evento[] eventos = controller.listar();
        boolean eventoEncontrado = false;
        for (Evento evento : eventos) {
            if (evento != null && evento.getNomeEvento().equals(nomeEvento)) {
                evento.adicionaReservaEvento(new Reserva(responsavel, qtdPessoas));
                System.out.println("Reserva adicionada com sucesso para o evento " + nomeEvento + "\n");
                eventoEncontrado = true;
                break;
            }
        }

        if (!eventoEncontrado) {
            System.out.println("Evento não encontrado.\n");
        }
    }

    private void listarEventos() {
        System.out.println("\n-_-_- Lista de Eventos -_-_-");
        Evento[] eventos = controller.listar();
        for (Evento evento : eventos) {
            if (evento != null) {
                System.out.println("Nome: " + evento.getNomeEvento());
                System.out.println("Data: " + evento.getData());
                System.out.println("Local: " + evento.getLocal());
                System.out.println("Lotação Máxima: " + evento.getLotacaoMaxima());
                System.out.println("Ingressos Vendidos: " + evento.getIngressosVendidos());
                System.out.println("Preço do Ingresso: " + evento.getPrecoIngresso());
            }
        }
        System.out.println();
    }
}

