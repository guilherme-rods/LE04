package br.edu.up;

import br.edu.up.Controles.ControleEstacionamento;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.Telas.*;

public class Programa {
    public static void main(String[] args) throws Exception {

        Estacionamento estacionamento = new Estacionamento();
        Menu menu = new Menu();
        ControleEstacionamento controller = new ControleEstacionamento(estacionamento, menu);
        controller.iniciar();
    }
}