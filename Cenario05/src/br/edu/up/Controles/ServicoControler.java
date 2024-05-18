package br.edu.up.Controles;

import br.edu.up.modelos.*;

public class ServicoControler {

    private Servico[] servicos;
    private int lotacao;

    public ServicoControler() {
        this.servicos = new Servico[10];  
        this.lotacao = 0;
    }
   public Servico[] getServicos(){
    return this.servicos;
   }
    public Servico getServico(String nome) {       
        for (Servico servico : this.servicos) {
            if (servico != null && servico.getNome().equals(nome)) {
                return servico;
            }
        }
        return null;
    }

    // public String[] getEventoTostring() {
    //     String[] vetor = new String[lotacao];
    //     for (int i = 0; i < lotacao; i++) {
    //         vetor[i] = servicos[i].toString();
    //     }
    //     return vetor;
    // }

    public void setEvento(String nome, String data, String local, int lotacaoMaxima, int qtdeIngressosVendidos, double precoIngresso) {
        if (lotacao < servicos.length) {          
            servicos[this.lotacao++] = new Evento(nome, data, local, lotacaoMaxima, qtdeIngressosVendidos, precoIngresso);
        } else {
            System.out.println("Capacidade máxima de serviços atingida.");
        }
    }
    public void setReserva(String nome, String data, String nomeResponsavel, double valor,  int qtdePessoas) {
        if (lotacao < servicos.length) { 
            this.lotacao++ ;          
            servicos[this.lotacao++] = new Reserva(nome, data, nomeResponsavel, valor, qtdePessoas);
        } else {
            System.out.println("Capacidade máxima de serviços atingida.");
        }
    }

    public boolean VerificarEvento(String nome) {
        for (int i = 0; i < lotacao; i++) {
            if (servicos[i] != null && servicos[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void excluirEvento(String nome) {
        for (int i = 0; i < lotacao; i++) {            
                servicos[i] = null;
                lotacao--;
                break;
            }
        }
    }

