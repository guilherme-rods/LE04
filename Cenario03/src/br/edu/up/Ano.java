package br.edu.up;

public class Ano {

    private int ano;

    private boolean bissexto;

    private Mes[] mes;

    public Ano(int ano, boolean bissexto, Mes mes) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.mes = new Mes[12];
        this.mes[mes.getMes()] = mes;
        
    }

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
