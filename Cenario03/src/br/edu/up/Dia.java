package br.edu.up;

public class Dia{

    private int diaMes;

    private Compromisso[] compromisso;

    public Dia(int diaMes, Compromisso compromisso) {
        this.diaMes = diaMes;
        this.compromisso=new Compromisso[24];
        this.compromisso[compromisso.getHora()-1]=compromisso;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso[] compromisso) {
        this.compromisso = compromisso;
    }


    

}
