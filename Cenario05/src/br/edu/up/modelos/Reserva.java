package br.edu.up.modelos;

import java.time.LocalDate;

public class Reserva {

    private String nome_responsavel;

    private int qtde_pessoas;

    private LocalDate data;

    private double valor;

    public Reserva(String nome_responsavel, int qtde_pessoas, LocalDate data, double valor) {
        this.nome_responsavel = nome_responsavel;
        this.qtde_pessoas = qtde_pessoas;
        this.data = data;
        this.valor = valor;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public int getQtde_pessoas() {
        return qtde_pessoas;
    }

    public void setQtde_pessoas(int qtde_pessoas) {
        this.qtde_pessoas = qtde_pessoas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}