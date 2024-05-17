package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.Controller.EstacionamentoController;

public class EstacionamentoView {
    
    private EstacionamentoController controller;
    private Scanner scanner;

    public EstacionamentoView(EstacionamentoController controller){
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void executar(){
        boolean executado=true;

        while (executado) {
            System.out.println("_-_-_-_ Estacionamento _-_-_-_");
            System.out.println("1. Inserir Carro");
            System.out.println("2. Retirar Carro");
            System.out.println("3. Emitir Relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    inserirCarro();
                    break;
                case 2:
                    retirarCarro();
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    executado = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void inserirCarro(){
        System.out.println("Inserir o possante: ");
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Local da vaga: ");
        int localVaga = scanner.nextInt();
        scanner.nextLine(); // limpa 

        System.out.print("Periodo: ");
        String periodo = scanner.nextLine();

        String resultado = controller.Estacionar(modelo, placa, cor, localVaga, periodo);
        System.out.println(resultado);
    }

    private void emitirRelatorio(){
        System.out.println("Emissão do relatorio:");
        String relatorio = controller.EmitirRelatorio();
        System.out.println(relatorio);
    }

    private void retirarCarro(){
        System.out.println("Retirada do carro: ");
        System.out.print("Local da vaga: ");
        int localVaga = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Periodo: ");
        String periodo = scanner.nextLine();

        System.out.println("Valor da tarifa por período: ");
        double valorTarifa = scanner.nextDouble();

        String resultado = controller.RetirarCarro(localVaga, periodo, valorTarifa);
        System.out.println(resultado);
    }

}
        
