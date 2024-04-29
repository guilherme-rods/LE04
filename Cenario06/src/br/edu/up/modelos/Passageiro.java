package br.edu.up.modelos;

public class Passageiro extends Pessoa10 {

    private int id_bagagem;

    private Passagem passagem;

    public Passageiro(int id_bagagem, Passagem passagem) {
        this.id_bagagem = id_bagagem;
        this.passagem = passagem;
    }

    public int getId_bagagem() {
        return id_bagagem;
    }

    public void setId_bagagem(int id_bagagem) {
        this.id_bagagem = id_bagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    
    
}
