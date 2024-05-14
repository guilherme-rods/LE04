package br.edu.up;

class Mes {
    private String nome;
    private int numero;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome) {
        this.nome = nome.toUpperCase();
        setQtdeDias();
    }

    public void setQtdeDias() {
        switch (nome) {
            case "JANEIRO":
                this.qtdeDias = 31;
                this.numero = 1;
                break;
            case "FEVEREIRO":
                this.qtdeDias = 28;
                this.numero = 2;
                break;
            case "MARÇO":
                this.qtdeDias = 31;
                this.numero = 3;
                break;
            case "ABRIL":
                this.qtdeDias = 30;
                this.numero = 4;
                break;
            case "MAIO":
                this.qtdeDias = 31;
                this.numero = 5;
                break;
            case "JUNHO":
                this.qtdeDias = 30;
                this.numero = 6;
                break;
            case "JULHO":
                this.qtdeDias = 31;
                this.numero = 7;
                break;
            case "AGOSTO":
                this.qtdeDias = 31;
                this.numero = 8;
                break;
            case "SETEMBRO":
                this.qtdeDias = 30;
                this.numero = 9;
                break;
            case "OUTUBRO":
                this.qtdeDias = 31;
                this.numero = 10;
                break;
            case "NOVEMBRO":
                this.qtdeDias = 30;
                this.numero = 11;
                break;
            case "DEZEMBRO":
                this.qtdeDias = 31;
                this.numero = 12;
                break;
        }
        this.dias = new Dia[qtdeDias];
    }

    public void setQtdeDiasBissexto() {
        if (this.numero == 2) {
            this.qtdeDias = 29;
            this.dias = new Dia[qtdeDias];
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void addDia(Dia dia) {
        int diaMes = dia.getDiaMes();
        if (diaMes > 0 && diaMes <= qtdeDias) {
            this.dias[diaMes - 1] = dia;
        } else {
            System.out.println("Dia inválido.");
        }
    }
}