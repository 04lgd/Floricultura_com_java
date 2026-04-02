package br.com.laura.floricultura.teste;

import br.com.laura.floricultura.dominio.*;

public class TesteVenda01 {
    public static void main(String[] args) {
        Flor segundaFlor = new Flor("Orquídea", 1756, 41, 6, "Rosa", "África", TipoFlor.ORNAMENTAL);
        Venda venda01 = new Venda();

        venda01.setProduto(segundaFlor);

        ControleEstoque controle = new ControleEstoque();
        venda01.setControle(controle);

        venda01.venda(2);

        System.out.println("--- VENDA APROVADA! ---");
        System.out.println("Valor total sem desconto: " + venda01.getQntVendida()*segundaFlor.getPreco());
        segundaFlor.desconto(2);

        System.out.println("--- INFORMAÇÕES PRIVADAS DA LOJA ---");
        System.out.println("Estoque total pós venda: " + controle.getEstoqueTotal());
        System.out.println("Quantidade de " + segundaFlor.getNome() + " no estoque pós venda: " + segundaFlor.getQntEstoque());
        System.out.println("Lucro total: " + venda01.getLucroTotal());
    }
}
