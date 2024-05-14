package br.edu.up;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        String mes;
        int dia;
        String nome;
        String local;
        String assunto;
        boolean bissexto;
        int hora;
        Mes mesObj;
        Dia diaObj;
        Compromisso[] compromissos = new Compromisso[24 * 365];
        Ano anoObj;
        int contador = 0;

        while (true) {
            System.out.println("Agendar compromisso - 1");
            System.out.println("Listar compromissos - 2");
            System.out.println("Cancelar - 3");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Qual ano vai ser agendado?");
                    ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Bissexto? 1 sim 2 não");
                    int bissextoInput = scanner.nextInt();
                    bissexto = (bissextoInput == 1);
                    scanner.nextLine();

                    System.out.println("Qual mês(extenso) vai ser agendado?");
                    mes = scanner.nextLine();

                    System.out.println("Qual dia vai ser agendado?");
                    dia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Qual seu nome?");
                    nome = scanner.nextLine();

                    System.out.println("Onde vai ser agendado?");
                    local = scanner.nextLine();

                    System.out.println("Qual assunto?");
                    assunto = scanner.nextLine();

                    System.out.println("Qual horário?");
                    hora = scanner.nextInt();
                    scanner.nextLine();

                    compromissos[contador] = new Compromisso(nome, local, assunto, hora);
                    diaObj = new Dia(dia, compromissos[contador]);
                    mesObj = new Mes(mes);
                    mesObj.addDia(diaObj);
                    anoObj = new Ano(ano, bissexto, mesObj);

                    System.out.println("Compromisso agendado:");
                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nome: " + compromissos[i].getPessoa());
                        System.out.println("Local: " + compromissos[i].getLocal());
                        System.out.println("Assunto: " + compromissos[i].getAssunto());
                        System.out.println("Hora: " + compromissos[i].getHora());
                    }
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}