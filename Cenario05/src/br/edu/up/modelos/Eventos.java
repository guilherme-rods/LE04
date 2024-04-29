package br.edu.up.modelos;

import java.time.*;

public class Eventos {

    private String nome;

    private LocalDate data;

    private String local;

    private int lotacaoMaxima;

    private int qtde_ingressos_vendidos;

    private double preco_ingresso;

    public Eventos(String nome, LocalDate data, String local, int lotacaoMaxima, int qtde_ingressos_vendidos,
            double preco_ingresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.qtde_ingressos_vendidos = qtde_ingressos_vendidos;
        this.preco_ingresso = preco_ingresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getQtde_ingressos_vendidos() {
        return qtde_ingressos_vendidos;
    }

    public void setQtde_ingressos_vendidos(int qtde_ingressos_vendidos) {
        this.qtde_ingressos_vendidos = qtde_ingressos_vendidos;
    }

    public double getPreco_ingresso() {
        return preco_ingresso;
    }

    public void setPreco_ingresso(double preco_ingresso) {
        this.preco_ingresso = preco_ingresso;
    }  
}