package br.edu.up.Telas;

import br.edu.up.Controles.ContatoController;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Pessoal;

import java.util.Scanner;

public class ContatoView {
    private final ContatoController _contatoController;
    private final Scanner _scanner;

    public ContatoView(){
        _contatoController = new ContatoController();
        _scanner = new Scanner(System.in);
    }

    public void NewPessoal(){
        System.out.println("NOVO CONTATO PESSOAL:");
        System.out.println("Digite o código:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();
        System.out.println("Digite o nome do contato:");
        var nome = _scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        var telefone = _scanner.nextLine();
        System.out.println("Digite a data de aniversário do contato:");
        var aniversario = _scanner.nextLine();

        _contatoController.AdicionarContatoPessoal(codigo, nome, telefone, aniversario);

        System.out.println();
    }

    public void NewComercial(){
        System.out.println("NOVO CONTATO COMERCIAL:");
        System.out.println("Digite o código do contato:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();
        System.out.println("Digite o nome do contato:");
        var nome = _scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        var telefone = _scanner.nextLine();
        System.out.println("Digite o CNPJ do contato:");
        var cnpj = _scanner.nextLine();

        _contatoController.AdicionarContatoComercial(codigo, nome, telefone, cnpj);

        System.out.println();
    }

    public void ExcluirContato(){
        System.out.println("Digite o código do contato a ser exluído:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();

        if(_contatoController.ExcluirContato(codigo))
            System.out.println("Contato excluído!");
        else
            System.out.println("Nenhum contato foi excluído!");

        System.out.println();
    }

    public void BuscarContato(){
        System.out.println("BUSCA DE CONTATO:");
        System.out.println("Digite o código do contato:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();

        var contato = _contatoController.BuscaContato(codigo);
        System.out.println("Código: " + contato.getCodigo());
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        if(contato instanceof Pessoal)
            System.out.println("Data de Aniversário: " + ((Pessoal) contato).getAniversario());
        else
            System.out.println("CNPJ: " + ((Comercial) contato).getCnpj());

        System.out.println();
    }

    public void ListarContatos(){
        System.out.println(_contatoController.ListarContatos());
    }
}
