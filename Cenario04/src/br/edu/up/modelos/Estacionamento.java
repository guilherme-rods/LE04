package br.edu.up.modelos;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Carro> carros = new ArrayList<>();
    private int vagas = 10;
    private double valorPeriodo = 5.00;

    public boolean entradaVeiculo(Carro carro){
        if(carros.size() < vagas){
            carros.add(carro);
            return true;
        }
        return false;
    }

    public Carro saidaVeiculo(String placa){
        for (Carro carro : carros){
            if(carro.getPlaca().equals(placa)){
                carros.remove(carro);
                return carro;
            }
        }
        return null;
    }

    public int getTotalVeiculos() {
        return carros.size();
    }

    public double getValorPeriodo() {
        return valorPeriodo;
    }

    public void setValorPeriodo(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }

    
}