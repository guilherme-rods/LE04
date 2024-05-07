package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class ClienteView {

    private Scanner scanner;

    public ClienteView(){
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("1.  Incluir cliente pessoa");
            System.out.println("2.  Incluir cliente empresa");
            System.out.println("3.  Mostrar dados cliente pessoa");
            System.out.println("4.  Mostrar dados cliente empresa");
            System.out.println("5.  Emprestar para cliente pessoa");
            System.out.println("6.  Emprestar para cliente empresa");
            System.out.println("7.  Devolução de cliente pessoa ");
            System.out.println("8.  Devolução de cliente empresa");
            System.out.println("9.  Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    MostrarDadoslientePessoa();
                    break;
                case 4:
                    MostrarDadoslienteEmpresa();
                    break;
                case 5:
                    EmprestarParaClientePessoa();
                    break;
                case 6:
                    EmprestarParaClienteEmpresa();
                    break;
                case 7:
                    DevoluçãoDeClientePessoa();
                    break;
                case 8:
                    DevoluçãoDeClienteEmpresa();
                    break;
                case 9:
                    return;
                default:
                    break;
            }
        }
    }

    public void incluirClientePessoa() {

    }

    public void incluirClienteEmpresa() {

    }

    public void MostrarDadoslientePessoa() {

    }

    public void MostrarDadoslienteEmpresa() {

    }

    public void EmprestarParaClientePessoa() {

    }

    public void EmprestarParaClienteEmpresa() {

    }

    public void DevoluçãoDeClientePessoa() {

    }

    public void DevoluçãoDeClienteEmpresa() {

    }

}
