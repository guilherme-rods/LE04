package br.edu.up;
import java.util.List;
import br.edu.up.controle.SeguradoraControler;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        SeguradoraControler sControler = new SeguradoraControler();
        SeguroVeiculo seguro = new SeguroVeiculo("123123", 1234567.88, 123456.00, true, true);
        SeguroVida segurov = new SeguroVida("123456", 123.33, true, true);

        sControler.seguradora.incluirSeguro(seguro);
        sControler.seguradora.incluirSeguro(segurov);

        List<?> seguros = sControler.seguradora.listarSeguros();
        for (Object seguro2 : seguros) {
            System.out.println(seguro2);
        }
        System.out.println(sControler.seguradora.quantidadeSeguros());
        System.out.println(sControler.seguradora.localizarSeguro("1jh3")[0]);
        System.out.println(sControler.seguradora.excluirSeguro("123123"));
        System.out.println(sControler.seguradora.quantidadeSeguros());
        sControler.seguradora.excluirTodosSeguros();
        System.out.println(sControler.seguradora.quantidadeSeguros());
    }
}
