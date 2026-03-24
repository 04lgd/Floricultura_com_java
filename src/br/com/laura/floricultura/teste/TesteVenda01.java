package br.com.laura.floricultura.teste;

import br.com.laura.floricultura.dominio.ControleEstoque;
import br.com.laura.floricultura.dominio.Flor;
import br.com.laura.floricultura.dominio.Produto;
import br.com.laura.floricultura.dominio.TipoFlor;

public class TesteVenda01 {
    public static void main(String[] args) {
        Flor segundaFlor = new Flor("Orquídea", 1756, 41, 6, "Rosa", "África", TipoFlor.ORNAMENTAL);
        ControleEstoque controleEstoque = new ControleEstoque();
        Produto[] produtos = {segundaFlor};
        controleEstoque.setProdutos(produtos);

        controleEstoque.venda(2);
        System.out.println("Quantidade estoque pós venda: " + produtos[0].getQntEstoque());
        System.out.println("Lucro total: " + controleEstoque.getLucroTotal());
    }
}
