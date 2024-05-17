package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.Controles.*;

public class Menu5 {

    private EventoControler e_control;

    public Menu5() {
        this.e_control = new EventoControler();
    }

    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu5() {
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Incluir Evento");
            System.out.println("2. Alterar Evento");
            System.out.println("3. Listar Eventos");
            System.out.println("4. Excluir Evento");
            System.out.println("5. Incluir Reserva");
            System.out.println("6. Alterar Reserva");
            System.out.println("7. Listar Reserva");
            System.out.println("8. Excluir Reserva");
            System.out.println("9. Sair");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {

                case 1:
                    incluirEvento();
                    break;
                case 2:
                System.out.println("\nQual evento você quer alterar?");
                    alterarEvento(1);
                    break;
                case 3:
                    listarEventos();
                    break;
                case 4:
                    excluirEvento();
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

    }

    public String incluirEvento(){
        System.out.println("Digite o nome do evento:");
        String nome = scanner.next();
        System.out.println();
        if(this.e_control.VerificarEvento(nome)==false){
            System.out.println("Digite a data do evento no formato (dd/mm/aaaa):");
            String data = scanner.next();
            System.out.println("Digite o local do evento:");
            String local = scanner.next();
            System.out.println("Qual é a lotação máxima do evento?");
            int lotacaoMaxima = scanner.nextInt();
            System.out.println("Digite a quantidade de ingressos vendidos?");
            int qtde_ingressos_vendidos = scanner.nextInt();
            System.out.println("Qual é o valor do ingresso?");
            double preco_ingresso = scanner.nextDouble();
            this.e_control.setEvento(nome, data, local, lotacaoMaxima, qtde_ingressos_vendidos, preco_ingresso);
            return "Evento criado.";
        }
        return "Este evento já existe."; 
    }

    public String alterarEvento(int e){
        System.out.println("Digite o nome do evento:");
        String nome = scanner.next();
        System.out.println();
        if(this.e_control.VerificarEvento(nome)==true){
            boolean b = true;
           while (b == true) {

            System.out.println("Deseja alterar qual informação?");
            System.out.println("1 - Nome.");
            System.out.println("2 - Data.");
            System.out.println("3 - Local.");
            System.out.println("4 - Lotação Máxima.");
            System.out.println("5 - Ingressos Vendidos.");
            System.out.println("6 - Preço do ingresso");

            switch (e) {
                case 1:
                    this.e_control.getEvento().setNome(scanner.next());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                    break;
                case 2:
                    this.e_control.getEvento().setData(scanner.next());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                    break;
                case 3:
                    this.e_control.getEvento().setLocal(scanner.next());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                    break;
                case 4:
                    this.e_control.getEvento().setLotacaoMaxima(scanner.nextInt());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                    break;
                case 5:
                    this.e_control.getEvento().setQtde_ingressos_vendidos(scanner.nextInt());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                    break;
                case 6:
                    this.e_control.getEvento().setPreco_ingresso(scanner.nextDouble());
                    System.out.println("Deseja alterar mais alguma informação? (S / N)");
                    if(scanner.next().toLowerCase().equals("n")){
                        b=false;
                    }
                        break;
            
                default:
                System.out.println("Opção invalida!");
                    break;
            }
           }
        }
        return "Este evento não existe.";
    }

    public String listarEventos(){
        return this.e_control.getEvento().toString();
    }

    public String excluirEvento(){
        System.out.println("Digite o nome do evento:");
        String nome = scanner.next();
        System.out.println();
        if(this.e_control.VerificarEvento(nome)==true){
            e_control.excluirEvento(nome);
        }
        return "Evento excluído!";
    }
    
}
