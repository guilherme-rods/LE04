package br.edu.up;

public class Mes {

    private int nome;

    private int qtdeDias;

    private Dia[] dias;

    public Mes(int nome, int qtdeDias, Dia[] dias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = dias;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    

}
