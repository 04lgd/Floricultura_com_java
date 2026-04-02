package br.com.laura.floricultura.dominio;

public class Venda {
    protected int qntVendida;
    protected double lucroTotal = 0;
    protected Produto produto;
    protected ControleEstoque controle;

    public void venda(int qntVendida) {
        this.qntVendida = qntVendida;
        if (this.produto != null) {
            lucroTotal += qntVendida*produto.getPreco();
            controle.impactoEstoqueTotal(this.getQntVendida());
            controle.impactoEstoqueProd(this.getQntVendida(), this.getProduto());
        }

    }

    public int getQntVendida() {
        return qntVendida;
    }

    public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ControleEstoque getControle() {
        return controle;
    }

    public void setControle(ControleEstoque controle) {
        this.controle = controle;
    }
}
