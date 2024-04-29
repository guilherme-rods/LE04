package br.edu.up.modelos;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public abstract class Seguro {
private String apolice;
private double vlrApolice;
private LocalDate dtInicio;
private LocalDate dtFim;
private List<Segurado> segurados;

    public List<Segurado> getSegurados() {
        return this.segurados;
    }

    public String getApolice() {
        return this.apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public double getVlrApolice() {
        return this.vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return this.dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public void setSegurados(Segurado segurado) {
        if (this.segurados == null) {
        this.segurados = new ArrayList<>();
    }
    this.segurados.add(segurado);
    }

}
