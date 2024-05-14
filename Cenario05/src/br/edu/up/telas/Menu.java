package br.edu.up.telas;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu(){
            System.out.println("Selecione uma opção:");
            System.out.println("1. Incluir evento/reserva");
            System.out.println("2. Alterar evento/reserva");
            System.out.println("3. Listar eventos e reservas");
            System.out.println("4. Excluir eventos/reservas");
            System.out.println("5. Sair");
            return scanner.nextInt();
    }
    
}
