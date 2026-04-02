package br.com.laura.floricultura.dominio;

public class ControleEstoque {
    protected int estoqueTotal = 30;
    protected int qntVendida;
    protected Produto produto;

    public void impactoEstoqueTotal(int qntVendida) {
        this.estoqueTotal -= qntVendida;
    }

    public void impactoEstoqueProd (int qntVendida, Produto produto) {
        produto.setQntEstoque(produto.getQntEstoque() - qntVendida);
    }

    public int getEstoqueTotal() {
        return estoqueTotal;
    }

    public void setEstoqueTotal(int estoqueTotal) {
        this.estoqueTotal = estoqueTotal;
    }

    public int getQntVendida() {
        return qntVendida;
    }

    public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }
}
