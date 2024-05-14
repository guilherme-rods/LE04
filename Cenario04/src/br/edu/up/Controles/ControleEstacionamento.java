package br.edu.up.Controles;

import br.edu.up.modelos.*;

public class ControleEstacionamento {

    private Estacionamento estacionamento;

    public ControleEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;

    }

    public boolean entradaVeiculo(Carro carro) {
        if (estacionamento.getTotalDeVeiculos() < estacionamento.getVagas()) {
            estacionamento.setCarro(carro);
            estacionamento.setTotalDeVeiculos(estacionamento.getTotalDeVeiculos() + 1);
            return true;
        }
        return false;
    }
    
    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public String saidaVeiculo(String placa) {
        Carro[] carros = estacionamento.getCarros();
        for (int i = 0; i < carros.length; i++) {

            if (carros[i].getPlaca().equals(placa)) {

                carros[i] = null;
                this.estacionamento.setCarros(carros);
                return "Retirado carro placa " + placa;

            }
        }
        return null;
    }

}