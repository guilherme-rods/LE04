package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Cliente;

public class ClienteControler {

    private List<Cliente> clientes;

    public ClienteControler() {
        this.clientes = new ArrayList<>();
    }

    public void emprestar(double valor, String nome) {
        this.clientes.forEach(cliente -> {
            if (cliente.getNome().equals(nome)) {
                cliente.setVlrEmprestado(valor);
            }
        });

    }

    public Double devolver(Double valor) {
        return 0.0;
    }

}
