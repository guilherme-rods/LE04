package br.edu.up;
import br.edu.up.telas.*;
import br.edu.up.controle.*;

public class Main {
    public static void main(String[] args) {
        SeguradoraControler controler = new SeguradoraControler();
        SeguradoraView view = new SeguradoraView(controler);
        view.iniciar();
    }
}