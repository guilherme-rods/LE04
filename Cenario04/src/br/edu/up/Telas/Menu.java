package br.edu.up.Telas;

import java.util.Scanner;

import br.edu.up.modelos.Carro;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Relatório");
        System.out.println("4. Sair");
        return scanner.nextInt();
    }

    public Carro solicitarDadosVeiculo() {
        System.out.println("Digite o modelo do veículo:");
        String modelo = scanner.next();
        System.out.println("Digite a placa do veículo:");
        String placa = scanner.next();
        System.out.println("Digite a cor do veículo:");
        String cor = scanner.next();
        return new Carro(modelo, placa, cor);
    }

    public String solicitarPlacaVeiculo() {
        System.out.println("Digite a placa do veículo:");
        return scanner.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    } 
}