package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda(List<Contato> contatos) {
        this.contatos = new ArrayList<>();
    }

    public void adicionarComercial(Contato comercial){
        this.contatos.add(comercial);
    }

    public void adicionarPessoal(Contato pessoal){
        this.contatos.add(pessoal);
    }

    public Contato getContato(int codigo) {
        for (Contato x : contatos) {
            if(x.getCodigo() == codigo){
                return x ;
            } 
        }
        return null;
        
    }    
}
