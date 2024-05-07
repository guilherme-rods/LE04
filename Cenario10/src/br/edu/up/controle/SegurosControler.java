package br.edu.up.controle;
import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.modelos.SeguroVida;

public class SegurosControler {

    public Seguro CreateSeguroVida(String apolice, double vlrApolice, Boolean cobreDoenca, Boolean cobreAcidente) {
        return new SeguroVida(apolice, vlrApolice, cobreDoenca, cobreAcidente);
    }

    public Seguro CreateSeguroVeiculo(String apolice, double vlrApolice, double valorFranquia,
            Boolean temCarroReserva, Boolean cobreVidros) {
        return new SeguroVeiculo(apolice, vlrApolice, valorFranquia, temCarroReserva, cobreVidros);
    }
    
}
