package br.edu.up;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String month;
        int day;
        String nome;
        String local;
        String assunto;
        boolean bissexto;
        int hora;
        Mes mes;
        Dia dia;
        Compromisso compromisso;
        Ano ano;

        System.out.println("Qual ano vai ser agendado?");
        year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Bissexto? 1 sim 2 não");
        int bissextoInput = scanner.nextInt();
        bissexto = (bissextoInput == 1);
        scanner.nextLine();

        System.out.println("Qual mês vai ser agendado?");
        month = scanner.nextLine();

        System.out.println("Qual dia vai ser agendado?");
        day = scanner.nextInt();
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

        compromisso = new Compromisso(nome, local, assunto, hora);
        dia = new Dia(day,compromisso);
        mes = new Mes(month);
        ano = new Ano(year, bissexto, mes);
        mes.setQtdeDias(ano, dia);

        

        System.out.println("Compromisso agendado:");
        System.out.println("Ano: " + ano.getAno());
        System.out.println("Mês: " + mes.getNome());
        System.out.println("Dia: " + dia.getDiaMes());
        System.out.println("Nome: " + compromisso.getPessoa());
        System.out.println("Local: " + compromisso.getLocal());
        System.out.println("Assunto: " + compromisso.getAssunto());
        System.out.println("Hora: " + compromisso.getHora());

        scanner.close();
    }
}
