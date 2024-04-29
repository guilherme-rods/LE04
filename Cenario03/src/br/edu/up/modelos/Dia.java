package br.edu.up.modelos;

public class Dia{

    private int diaMes;

    private Compromisso[] compromisso=new Compromisso[24];

    public Dia(Compromisso c){
       
    }

    public Dia(int diaMes, Compromisso[] compromisso) {
        this.diaMes = diaMes;
        this.compromisso = compromisso;
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
