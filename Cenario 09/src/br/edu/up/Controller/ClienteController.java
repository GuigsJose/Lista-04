package Controller;
import java.util.ArrayList;

import Model.ClienteEmpresa;
import Model.ClientePessoa;

public class ClienteController {
   
        private ArrayList<ClientePessoa> clientesPessoas;
        private ArrayList<ClienteEmpresa> clientesEmpresas;
    
        public ClienteController() {
            this.clientesPessoas = new ArrayList<>();
            this.clientesEmpresas = new ArrayList<>();
        }
    
        public void incluirClientePessoa(String nome, String telefone, String email, String cpf, double peso, double altura) {
            ClientePessoa cliente = new ClientePessoa(nome, telefone, email, altura, altura, cpf, peso, altura);
            clientesPessoas.add(cliente);
        }
    
        public void incluirClienteEmpresa(String nome, String telefone, String email, String cnpj, String inscEstadual, int anoFundacao) {
            ClienteEmpresa cliente = new ClienteEmpresa(nome, telefone, email, anoFundacao, anoFundacao, cnpj, inscEstadual, anoFundacao);
            clientesEmpresas.add(cliente);
        }
    
        public ArrayList<ClientePessoa> getClientesPessoas() {
            return clientesPessoas;
        }
    
        public ArrayList<ClienteEmpresa> getClientesEmpresas() {
            return clientesEmpresas;
        }
    
        public void emprestarParaClientePessoa(int index, double valor) throws Exception {
            ClientePessoa cliente = clientesPessoas.get(index);
            double novoValor = cliente.getVlrEmprestado() + valor;
            if (novoValor > cliente.getVlrMaxCredito()) {
                throw new Exception("Valor excede o limite de crédito!");
            }
            cliente.setVlrEmprestado(novoValor);
        }
    
        public void emprestarParaClienteEmpresa(int index, double valor) throws Exception {
            ClienteEmpresa cliente = clientesEmpresas.get(index);
            double novoValor = cliente.getVlrEmprestado() + valor;
            if (novoValor > cliente.getVlrMaxCredito()) {
                throw new Exception("Valor excede o limite de crédito!");
            }
            cliente.setVlrEmprestado(novoValor);
        }
    
        public void devolverClientePessoa(int index, double valor) throws Exception {
            ClientePessoa cliente = clientesPessoas.get(index);
            double novoValor = cliente.getVlrEmprestado() - valor;
            if (novoValor < 0) {
                throw new Exception("Valor de devolução inválido!");
            }
            cliente.setVlrEmprestado(novoValor);
        }
    
        public void devolverClienteEmpresa(int index, double valor) throws Exception {
            ClienteEmpresa cliente = clientesEmpresas.get(index);
            double novoValor = cliente.getVlrEmprestado() - valor;
            if (novoValor < 0) {
                throw new Exception("Valor de devolução inválido!");
            }
            cliente.setVlrEmprestado(novoValor);
        }
    }


