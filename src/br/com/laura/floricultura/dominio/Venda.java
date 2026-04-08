package br.com.laura.floricultura.dominio;

public class Venda {
    protected int qntVendida;
    protected double faturamentoTotal = 0;
    protected Produto produto;
    protected ControleEstoque controle;
    protected double valorFinal;

    public void venda(int qntVendida) {
        this.qntVendida = qntVendida;
        if (this.produto != null) {
            controle.impactoEstoqueTotal(this.getQntVendida());
            controle.impactoEstoqueProd(this.getQntVendida(), this.getProduto());
            setValorFinal(produto.valorComDesconto(this.qntVendida));
            faturamentoTotal = valorFinal;
        }
    }

    public int getQntVendida() {
        return qntVendida;
    }

    public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }

    public double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
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

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
