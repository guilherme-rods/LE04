package br.edu.up.modelos;

public class Ano {

    private int ano;

    private boolean bissexto;

    private Mes[] mes;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMes() {
        return mes;
    }

    public void setMes(Mes[] mes) {
        this.mes = mes;
    }

    

}
