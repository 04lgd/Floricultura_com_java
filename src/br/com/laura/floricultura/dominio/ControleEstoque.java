package br.com.laura.floricultura.dominio;

public class ControleEstoque {
    private double lucroTotal = 0;
    private Produto[] produtos;

    public void venda(int qntVendida) {
        if (produtos != null && produtos.length > 0) {
            int novoEstoque = produtos[0].getQntEstoque() - qntVendida;
            produtos[0].setQntEstoque(novoEstoque);
        }

        lucroTotal += qntVendida*produtos[0].getPreco();
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
    }


    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
