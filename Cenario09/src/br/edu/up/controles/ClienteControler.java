package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Cliente;

public class ClienteControler {

    private List<Cliente> clientes;

    public ClienteControler() {
        this.clientes = new ArrayList<>();
    }

    public void setCliente(Cliente cliente){
        this.clientes.add(cliente); 
    }

    public Cliente getCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public Double devolver(Double valor) {
        return 0.0;
    }
    public List<Cliente> getClientes(){
        return this.clientes;
    }
}
