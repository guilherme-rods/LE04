package br.edu.up.modelos;

public class Estacionamento {

    private int[] qtdeVagas = new int[10];

    private String periodo;

    private double valorPeriodo;

    private Carro[] carro;

    public int[] getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int[] qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getValorPeriodo() {
        return valorPeriodo;
    }

    public void setValorPeriodo(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    

    

    



}
