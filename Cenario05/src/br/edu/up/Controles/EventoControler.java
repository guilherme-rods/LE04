package br.edu.up.Controles;

import br.edu.up.modelos.*;

public class EventoControler {

    private Eventos[] evento;

    public EventoControler(){
        this.evento = new Eventos[10];
    }

    public Eventos getEvento() {
        return evento[1];
    }

    public void setEvento(String nome, String data, String local, int lotacaoMaxima, int qtde_ingressos_vendidos,
    double preco_ingresso) {
        Eventos evento = new Eventos(nome, data, local, lotacaoMaxima, qtde_ingressos_vendidos, preco_ingresso);      
    }

    public boolean VerificarEvento(String nome) {
        if(this.evento[0] != null){
            for(int i = 0; i < this.evento.length; i++){
                if(this.evento[i].getNome().equals(nome)){
                    return true;
                }
            }
            return false;
        } 
        return false;
    }


    public void excluirEvento(String nome){
        for(int i = 0; i < this.evento.length; i++){
            if(VerificarEvento(nome) == true){
                this.evento[i] = null;
            }
        }
    }

    
    
}
