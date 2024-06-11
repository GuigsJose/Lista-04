package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.edu.up.model.Seguro;

public class SeguroController {

    private List<Seguro> seguros;

    public SeguroController(){
        this.seguros = new ArrayList<>();
    }
    
     public boolean incluirSeguro(Seguro seguro) {
        if (localizarSeguro(seguro.getApolice()).isPresent()) {
            return false;
        }
        seguros.add(seguro);
        return true;
    }

    public Optional<Seguro> localizarSeguro(String apolice) {
        return seguros.stream().filter(s -> s.getApolice().equals(apolice)).findFirst();
    }

    public boolean excluirSeguro(String apolice) {
        Optional<Seguro> seguro = localizarSeguro(apolice);
        if (seguro.isPresent()) {
            seguros.remove(seguro.get());
            return true;
        }
        return false;
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}

