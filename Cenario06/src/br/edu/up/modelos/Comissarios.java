package br.edu.up.modelos;

public class Comissarios extends Tripulacao{

    private String[] idioma;

    public Comissarios(String nome, String rg, int id_aeronautica, int matricula, String[] idioma) {
        super(nome, rg, id_aeronautica, matricula);
        this.idioma = idioma.clone();
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    
}
