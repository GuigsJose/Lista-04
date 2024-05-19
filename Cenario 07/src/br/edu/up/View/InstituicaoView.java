package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.PrincipalController;
import br.edu.up.Model.Aluno;
import br.edu.up.Model.Competencia;
import br.edu.up.Model.Disciplina;
import br.edu.up.Model.Professor;
import br.edu.up.Model.SituacaoCompetencia;

public class InstituicaoView {
    private PrincipalController controller;
    private Scanner sc;

    public InstituicaoView(PrincipalController controller) {
        this.controller = controller;
        this.sc = new Scanner(System.in);
    }

    public void executar() {
        int opcao;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Buscar Professor");
            System.out.println("3. Remover Professor");
            System.out.println("4. Adicionar Aluno");
            System.out.println("5. Buscar Aluno");
            System.out.println("6. Remover Aluno");
            System.out.println("7. Adicionar Disciplina");
            System.out.println("8. Buscar Disciplina");
            System.out.println("9. Remover Disciplina");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
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
                case 7:
                    adicionarDisciplina();
                    break;
                case 8:
                    buscarDisciplina();
                    break;
                case 9:
                    removerDisciplina();
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 10);
    }

    private void adicionarProfessor() {
        System.out.println("\n-_-_- ADICIONAR PROFESSOR -_-_-");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("RG: ");
        String rg = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        System.out.print("Número Lattes: ");
        String numeroLattes = sc.nextLine();
        System.out.print("Instituição de Titulação: ");
        String instituicao = sc.nextLine();
        System.out.print("Ano de Conclusão: ");
        int anoConclusao = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Título Obtido: ");
        String tituloObtido = sc.nextLine();
        System.out.print("Título do Trabalho de Conclusão: ");
        String tituloTrabalho = sc.nextLine();

        Professor professor = new Professor(nome, rg, matricula, numeroLattes, instituicao, anoConclusao, tituloObtido, tituloTrabalho);
        controller.adicionaProfessor(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    private void adicionarAluno() {
    System.out.println("\n-_-_- ADICIONAR ALUNO -_-_-");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("RG: ");
    String rg = sc.nextLine();
    System.out.print("Matrícula: ");
    String matricula = sc.nextLine();
    System.out.print("Ano de Ingresso: ");
    int anoIngresso = sc.nextInt();
    sc.nextLine();
    System.out.print("Curso: ");
    String curso = sc.nextLine();
    System.out.print("Turno: ");
    String turno = sc.nextLine();

    Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
    controller.adicionarAluno(aluno);
    System.out.println("Aluno adicionado com sucesso!");
}
    private void adicionarDisciplina() {
    System.out.println("\n-_-_- ADICIONAR DISCIPLINA -_-_-");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Identificador: ");
    String identificador = sc.nextLine();
    System.out.print("Currículo: ");
    String curriculo = sc.nextLine();
    System.out.print("Quantidade de Competências: ");
    int qtdCompetencias = sc.nextInt();
    sc.nextLine();

    Competencia[] competencias = new Competencia[qtdCompetencias];
    for (int i = 0; i < qtdCompetencias; i++) {
        System.out.print("Descrição da Competência " + (i + 1) + ": ");
        String descricao = sc.nextLine();
        System.out.print("É necessária? (true/false): ");
        boolean necessaria = sc.nextBoolean();
        sc.nextLine(); // Limpar o buffer do scanner
        competencias[i] = new Competencia(descricao, necessaria);
    }

    Disciplina disciplina = new Disciplina(nome, identificador, curriculo, competencias, null, null);
    controller.adicionarDisciplina(disciplina);
    System.out.println("Disciplina adicionada com sucesso!");
}

private void adicionarSituacao() {
    System.out.println("\n-_-_- ADICIONAR SITUAÇÃO -_-_-");
    System.out.print("Matrícula do Aluno: ");
    String matriculaAluno = sc.nextLine();
    System.out.print("Identificador da Disciplina: ");
    String identificadorDisciplina = sc.nextLine();

    Aluno aluno = controller.buscarAluno(matriculaAluno);
    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    Disciplina disciplina = controller.buscarDisciplina(identificadorDisciplina);
    if (disciplina == null) {
        System.out.println("Disciplina não encontrada.");
        return;
    }

    System.out.print("Quantidade de Competências: ");
    int qtdCompetencias = sc.nextInt();
    sc.nextLine(); 

    Competencia[] competencias = new Competencia[qtdCompetencias];
    for (int i = 0; i < qtdCompetencias; i++) {
        System.out.print("Descrição da Competência " + (i + 1) + ": ");
        String descricao = sc.nextLine();
        System.out.print("Competência Atingida? (true/false): ");
        boolean atingida = sc.nextBoolean();
        sc.nextLine(); 
        competencias[i] = new Competencia(descricao, atingida);
    }

    SituacaoCompetencia situacao = new SituacaoCompetencia(aluno, disciplina);
    controller.adicionarSituacao(situacao);
    System.out.println("Situação adicionada com sucesso!");
}

private void removerProfessor() {
    System.out.println("\n-_-_- REMOVER PROFESSOR -_-_-");
    System.out.print("Digite a matrícula do professor a ser removido: ");
    String matricula = sc.nextLine();
    controller.removeProfessor(matricula);
    System.out.println("Professor removido com sucesso!");
}

private void removerAluno() {
    System.out.println("\n-_-_- REMOVER ALUNO -_-_-");
    System.out.print("Digite a matrícula do aluno a ser removido: ");
    String matricula = sc.nextLine();
    controller.removeAluno(matricula);
    System.out.println("Aluno removido com sucesso!");
}

private void removerDisciplina() {
    System.out.println("\n-_-_- REMOVER DISCIPLINA -_-_-");
    System.out.print("Digite o identificador da disciplina a ser removida: ");
    String identificador = sc.nextLine();
    controller.removerDisciplina(identificador);
    System.out.println("Disciplina removida com sucesso!");
}

private void removerSituacao() {
    System.out.println("\n-_-_- REMOVER SITUAÇÃO -_-_-");
    System.out.print("Digite a matrícula do aluno: ");
    String matriculaAluno = sc.nextLine();
    System.out.print("Digite o identificador da disciplina: ");
    String identificadorDisciplina = sc.nextLine();

    Aluno aluno = controller.buscarAluno(matriculaAluno);
    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    Disciplina disciplina = controller.buscarDisciplina(identificadorDisciplina);
    if (disciplina == null) {
        System.out.println("Disciplina não encontrada.");
        return;
    }

    controller.removerSituacao(aluno, disciplina);
    System.out.println("Situação removida com sucesso!");
}

private void buscarProfessor() {
    System.out.println("\n=== BUSCAR PROFESSOR ===");
    System.out.print("Digite a matrícula do professor: ");
    String matricula = sc.nextLine();
    Professor professor = controller.buscaMatricula(matricula);
    if (professor != null) {
        System.out.println("Professor encontrado:");
        System.out.println(professor);
    } else {
        System.out.println("Professor não encontrado.");
    }
}

private void buscarAluno() {
    System.out.println("\n=== BUSCAR ALUNO ===");
    System.out.print("Digite a matrícula do aluno: ");
    String matricula = sc.nextLine();
    Aluno aluno = controller.buscarAluno(matricula);
    if (aluno != null) {
        System.out.println("Aluno encontrado:");
        System.out.println(aluno);
    } else {
        System.out.println("Aluno não encontrado.");
    }
}

private void buscarDisciplina() {
    System.out.println("\n=== BUSCAR DISCIPLINA ===");
    System.out.print("Digite o identificador da disciplina: ");
    String identificador = sc.nextLine();
    Disciplina disciplina = controller.buscarDisciplina(identificador);
    if (disciplina != null) {
        System.out.println("Disciplina encontrada:");
        System.out.println(disciplina);
    } else {
        System.out.println("Disciplina não encontrada.");
    }
}

private void buscarSituacao() {
    System.out.println("\n=== BUSCAR SITUAÇÃO ===");
    System.out.print("Digite a matrícula do aluno: ");
    String matriculaAluno = sc.nextLine();
    System.out.print("Digite o identificador da disciplina: ");
    String identificadorDisciplina = sc.nextLine();

    Aluno aluno = controller.buscarAluno(matriculaAluno);
    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    Disciplina disciplina = controller.buscarDisciplina(identificadorDisciplina);
    if (disciplina == null) {
        System.out.println("Disciplina não encontrada.");
        return;
    }

    SituacaoCompetencia situacao = controller.buscarCompetencia(aluno, disciplina);
    if (situacao != null) {
        System.out.println("Situação encontrada:");
        System.out.println(situacao);
    } else {
        System.out.println("Situação não encontrada.");
    }
}
}
