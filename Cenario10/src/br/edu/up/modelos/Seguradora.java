package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Seguradora {

    protected List<Seguro> seguros;

    public List<Seguro> getSeguros() {
        return this.seguros;
    }
    public Seguradora(){
        this.seguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }

    public String[] localizarSeguro(String busca) {
        String[] listaSeguros = new String[seguros.size()];
        int j = 0;
        for (int i = 0; i < this.seguros.size(); i++) {           
            if (this.seguros.get(i).toString().contains(busca)) {
                listaSeguros[j] = seguros.get(i).toString();
                j++;
            }
        }
        if (j == 0) {
            return new String[] {"Nenhum seguro encontrado"};
        }
        return listaSeguros;
    }

    public String excluirSeguro(String apolice) {
        for (int i = 0; i < this.seguros.size(); i++) {
            if (this.seguros.get(i).getApolice().equals(apolice)) {
                this.seguros.remove(i);
                return "removido o contrato da apolice :" + apolice;
            }
        }
        return "Nenhum contrato encontrado com essa apolice";
    }

    public String[] listarSeguros() {
        String[] listaSeguros = new String[seguros.size()];
        for (int i = 0; i < seguros.size(); i++) {
            listaSeguros[i] = seguros.get(i).toString();
        }
        return listaSeguros;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public void excluirTodosSeguros() {
        this.seguros = new ArrayList<>();
    }
}
