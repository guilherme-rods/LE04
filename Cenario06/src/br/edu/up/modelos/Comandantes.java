package br.edu.up.modelos;

public class Comandantes extends Tripulacao {

    private int total_hora_voo;

    public Comandantes(String nome, String rg, int id_aeronautica, int matricula, int total_hora_voo) {
        super(nome, rg, id_aeronautica, matricula);
        this.total_hora_voo = total_hora_voo;
    }

    public int getTotal_hora_voo() {
        return total_hora_voo;
    }

    public void setTotal_hora_voo(int total_hora_voo) {
        this.total_hora_voo = total_hora_voo;
    }

  
}
