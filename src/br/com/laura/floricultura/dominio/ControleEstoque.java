package br.com.laura.floricultura.dominio;

public class ControleEstoque {
    protected int estoqueTotal = 30;
    protected int qntVendida;
    protected Produto produto;

    public void impactoEstoqueTotal(int qntVendida) {
        if ((this.estoqueTotal -= qntVendida) < 0) {
            throw new IllegalArgumentException("O estoque não pode ficar negativo.");
        } else {
            this.estoqueTotal -= qntVendida;
        }
    }

    public void impactoEstoqueProd (int qntVendida, Produto produto) {
        if ((produto.getQntEstoque() - qntVendida) < 0) {
            throw new IllegalArgumentException("O estoque não pode ficar negativo.");
        } else {
            produto.setQntEstoque(produto.getQntEstoque() - qntVendida);
        }
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
