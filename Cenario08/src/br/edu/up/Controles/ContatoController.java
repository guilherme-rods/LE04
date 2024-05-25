package br.edu.up.Controles;

import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;

public class ContatoController {
    private final Agenda _agenda;

    public ContatoController() {
        _agenda = new Agenda();
    }

    public void AdicionarContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        var pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        _agenda.adicionarPessoal(pessoal);
    }

    public void AdicionarContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        var comercial = new Comercial(codigo, nome, telefone, cnpj);
        _agenda.adicionarComercial(comercial);
    }

    public boolean ExcluirContato(int codigo){
        return _agenda.excluirContato(codigo);
    }

    public Contato BuscaContato(int codigo){
        return _agenda.getContato(codigo);
    }

    public String ListarContatos(){
        return _agenda.listarContatos();
    }
}
