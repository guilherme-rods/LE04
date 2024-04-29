package br.edu.up.modelos;

public class Aeronave {

    private int codigo;

    private String tipo;

    private int qtde_assentos;

    public Aeronave(int codigo, String tipo, int qtde_assentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.qtde_assentos = qtde_assentos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtde_assentos() {
        return qtde_assentos;
    }

    public void setQtde_assentos(int qtde_assentos) {
        this.qtde_assentos = qtde_assentos;
    }   
}