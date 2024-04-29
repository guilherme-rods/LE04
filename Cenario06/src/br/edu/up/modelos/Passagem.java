package br.edu.up.modelos;

import java.time.LocalDateTime;

public class Passagem {

    private int numero_assento;

    private String classe;

    private LocalDateTime data_voo;

    public Passagem(int numero_assento, String classe, LocalDateTime data_voo) {
        this.numero_assento = numero_assento;
        this.classe = classe;
        this.data_voo = data_voo;
    }

    public int getNumero_assento() {
        return numero_assento;
    }

    public void setNumero_assento(int numero_assento) {
        this.numero_assento = numero_assento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public LocalDateTime getData_voo() {
        return data_voo;
    }

    public void setData_voo(LocalDateTime data_voo) {
        this.data_voo = data_voo;
    }

    


    
}
