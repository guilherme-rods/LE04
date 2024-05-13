package br.edu.up;

public class Mes {

    private String nome;
    private int mes; 

    private int qtdeDias;

    private Dia[] dias;

    public Mes(String nome) {
        this.nome = nome;
    }
    public void setQtdeDias(Ano ano,Dia dias){
        
        
        switch (nome.toUpperCase()) {
            case "JANEIRO":
                this.qtdeDias = 31;
                this.mes = 1;
                break;
            case "FEVEREIRO":
            this.qtdeDias = ano.isBissexto() ? 29 : 28;
            this.mes = 2;
                break;
            case "MARÇO":
                this.qtdeDias = 31;
                this.mes = 3;
                break;
            case "ABRIL":
                this.qtdeDias = 30;
                this.mes = 4;
                break;
            case "MAIO":
                this.qtdeDias = 31;
                this.mes = 5;
                break;
            case "JUNHO":
                this.qtdeDias = 30;
                this.mes = 6;
                break;
            case "JULHO":
                this.qtdeDias = 31;
                this.mes = 7;
                break;
            case "AGOSTO":
                this.qtdeDias = 31;
                this.mes = 8;
                break;
            case "SETEMBRO":
                this.qtdeDias = 30;
                this.mes = 9;
                break;
            case "OUTUBRO":
                this.qtdeDias = 31;
                this.mes = 10;
                break;
            case "NOVEMBRO":
                this.qtdeDias = 30;
                this.mes = 11;
                break;
            case "DEZEMBRO":
                this.qtdeDias = 31;
                this.mes = 12;
                break;
            }
            this.dias = new Dia[qtdeDias];
            this.dias[dias.getDiaMes()] = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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
    
    public int getMes(){
        return mes;
    }

    

}
