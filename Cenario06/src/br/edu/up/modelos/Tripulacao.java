package br.edu.up.modelos;
import br.edu.up.modelos.*;

public class Tripulacao extends Pessoa06 {

    private int id_aeronautica;

    private int matricula;

    public Tripulacao(String nome, String rg, int id_aeronautica, int matricula) {
        super(nome, rg);
        this.id_aeronautica = id_aeronautica;
        this.matricula = matricula;
    }

    public int getId_aeronautica() {
        return id_aeronautica;
    }

    public void setId_aeronautica(int id_aeronautica) {
        this.id_aeronautica = id_aeronautica;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}