package br.edu.up.Controles;

import br.edu.up.modelos.*;
import br.edu.up.Telas.*;

public class ControleEstacionamento {

    private Estacionamento estacionamento;
    private Menu menu;

    public ControleEstacionamento(Estacionamento estacionamento, Menu menu){
        this.estacionamento = estacionamento;
        this.menu = menu;
    }

    public void realizarEntradaVeiculo(){
        Carro carro = menu.solicitarDadosVeiculo();
        if (estacionamento.entradaVeiculo(carro)){
            menu.mostrarMensagem("Veículo estacionado!");
        }else {
            menu.mostrarMensagem("Estacionamento lotado!");
        }
    }

    public void realizarSaidaVeiculo() {
        String placa = menu.solicitarPlacaVeiculo();
        Carro carro = estacionamento.saidaVeiculo(placa);
        if (carro != null) {
            menu.mostrarMensagem("Veículo com placa " + placa + " saiu do estacionamento.");
        } else {
            menu.mostrarMensagem("Veículo com placa " + placa + " não encontrado.");
        }
    }

    private void gerarRelatorio() {
        double totalVeiculos = estacionamento.getTotalVeiculos();
        double valorTotal = totalVeiculos * estacionamento.getValorPeriodo();
        menu.mostrarMensagem("Total de veículos estacionados: " + totalVeiculos);
        menu.mostrarMensagem("Valor total a receber: R$ " + valorTotal);
    }

    public void iniciar(){
        int opcao;
        do{
            opcao = menu.mostrarMenu();
            switch (opcao) {
                case 1:
                    realizarEntradaVeiculo();
                    break;
                    case 2:
                    realizarSaidaVeiculo();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    menu.mostrarMensagem("Saindo do programa.");
                    break;
                default:
                    menu.mostrarMensagem("Opção inválida.");
            }
        } while (opcao != 4);
        
    }   
}