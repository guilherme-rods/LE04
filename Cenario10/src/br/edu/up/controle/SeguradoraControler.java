package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.*;

public class SeguradoraControler {

    private Seguradora seguradora;

    public SeguradoraControler() {
        this.seguradora = new Seguradora();
    }

    public void incluirSeguro(Seguro seguro) {
        this.seguradora.getSeguros().add(seguro);
    }

    public String[] localizarSeguro(String busca) {
        List<Seguro> seguros = this.seguradora.getSeguros();
        List<String> encontrados = new ArrayList<>();

        for (Seguro seguro : seguros) {
            if (seguro.toString().contains(busca)) {
                encontrados.add(seguro.toString());
            }
        }

        if (encontrados.isEmpty()) {
            return new String[] {"Nenhum seguro encontrado"};
        }
        return encontrados.toArray(new String[0]);
    }

    public String excluirSeguro(String apolice) {
        List<Seguro> seguros = this.seguradora.getSeguros();
        for (int i = 0; i < seguros.size(); i++) {
            if (seguros.get(i).getApolice().equals(apolice)) {
                seguros.remove(i);
                return "Removido o contrato da apólice: " + apolice;
            }
        }
        return "Nenhum contrato encontrado com essa apólice";
    }

    public List<Seguro> listarSeguros() {
        return new ArrayList<>(this.seguradora.getSeguros());
    }

    public int quantidadeSeguros() {
        return this.seguradora.getSeguros().size();
    }

    public void excluirTodosSeguros() {
        this.seguradora.getSeguros().clear();
    }
}
