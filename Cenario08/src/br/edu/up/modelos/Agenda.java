package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarComercial(Comercial contato){
        contatos.add(contato);
    }

    public void adicionarPessoal(Pessoal contato){
        contatos.add(contato);
    }

    public Contato getContato(int codigo){
        for (Contato contato : contatos){
            if (contato.getCodigo() == codigo){
                return contato;
            }
        }

        return null;
    }

    public boolean excluirContato(int codigo){
        return contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public String listarContatos(){
        StringBuilder sb = new StringBuilder();
        contatos.forEach(contato -> sb.append(contato.toString()).append("\n"));

        return sb.toString();
    }
}