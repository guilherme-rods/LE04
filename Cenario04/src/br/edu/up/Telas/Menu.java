package br.edu.up.Telas;

import java.util.Scanner;
import br.edu.up.modelos.*;
import br.edu.up.Controles.*;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    EstacionamentoControler estacionamentoC;
    Estacionamento estacionamento;

    public Menu() {
        this.estacionamentoC = new EstacionamentoControler(estacionamento);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Entrada de veículo");
            System.out.println("2. Saída de veículo");
            System.out.println("3. Relatório");
            System.out.println("4. Sair");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {

                case 1:
                    realizarEntradaVeiculo();
                    break;
                case 2:
                System.out.println("\nQual a placa de seu carro?");
                    realizarSaidaVeiculo(scanner.nextLine());
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalido");
                    break;
            }
        }

    }
    
    public void realizarEntradaVeiculo(){
        System.out.println("Digite o modelo do veículo:");
        String modelo = scanner.next();
        System.out.println("Digite a placa do veículo:");
        String placa = scanner.next();
        System.out.println("Digite a cor do veículo:");
        String cor = scanner.next();
        Carro carro = new Carro(modelo, placa, cor);
        if (this.estacionamentoC.entradaVeiculo(carro)){
            mostrarMensagem("Veículo estacionado!");
        }else {
            mostrarMensagem("Estacionamento lotado!");
        }
    }
    
    public void realizarSaidaVeiculo(String placa) {
       estacionamentoC.saidaVeiculo(placa);
       
    }

    public String solicitarPlacaVeiculo() {
        System.out.println("Digite a placa do veículo:");
        return scanner.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    private void gerarRelatorio() {
        double totalVeiculos = estacionamentoC.getEstacionamento().getCarros().length;
        double valorTotal = totalVeiculos * estacionamentoC.getEstacionamento().getValorPeriodo();
        mostrarMensagem("Total de veículos estacionados: " + totalVeiculos);
        mostrarMensagem("Valor total a receber: R$ " + valorTotal);
    }
}