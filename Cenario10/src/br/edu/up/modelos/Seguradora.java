package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Seguradora {

    protected List<Seguro> seguros;

    public List<Seguro> getSeguros() {
        return this.seguros;
    }

    public Seguradora() {
        this.seguros = new ArrayList<>();
    }
}
