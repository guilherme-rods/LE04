package br.edu.up.modelos;

public class Estacionamento {

    private Carro[] carros = new Carro[10];
    private int vagas = 10;
    private double valorPeriodo = 5.00;
    private int totalDeVeiculos = 0;

    public boolean entradaVeiculo(Carro carro){
        if(totalDeVeiculos < vagas){
            carros[totalDeVeiculos] = carro;
            totalDeVeiculos++;
            return true;
        }
        return false;
    }

    public Carro saidaVeiculo(String placa){
        for (int i = 0; i < totalDeVeiculos; i++){
            if(carros[i].getPlaca().equals(placa)){
            Carro carroSaida = carros[i];
            for(int j = 0; j < totalDeVeiculos - 1; j++){
                carros[j] = carros[j + 1];
            }
            carros[totalDeVeiculos - 1] = null;
            totalDeVeiculos--;
            return carroSaida;
            }
        }
        return null;
    }

    public int getTotalVeiculos() {
        return totalDeVeiculos;
    }

    public double getValorPeriodo() {
        return valorPeriodo;
    }

    public void setValorPeriodo(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }
}