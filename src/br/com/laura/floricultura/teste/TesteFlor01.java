package br.com.laura.floricultura.teste;

import br.com.laura.floricultura.dominio.Flor;
import br.com.laura.floricultura.dominio.TipoFlor;

public class TesteFlor01 {
    public static void main(String[] args) {

        Flor primeiraFlor = new Flor("Orquídea", 1756, 41, 6, "Rosa", "África", TipoFlor.ORNAMENTAL);

        System.out.println("-----------------");
        System.out.println("Imprimindo ficha da flor cadastrada para confirmação:");
        System.out.println(primeiraFlor);
        System.out.println("Fim da impressão");
        System.out.println("-----------------");


        TipoFlor flor = TipoFlor.valueOf("ORNAMENTAL");
        System.out.println(flor.getTIPO_FLOR());
        TipoFlor flor1 = TipoFlor.tipoFlorPorNomeFlor("Ornamental");
        System.out.println(flor1);
    }
}
