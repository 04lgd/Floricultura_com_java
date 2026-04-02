package br.com.laura.floricultura.dominio;

public class Flor extends Produto {
    private String cor;
    private String origem;
    private String significado;
    private TipoFlor tipoDeFlor;

    public Flor(String nome, int id, int preco, int qntEstoque, String cor, String origem, String significado, TipoFlor tipoDeFlor) {
        super(nome, id, preco, qntEstoque);
        this.cor = cor;
        this.origem = origem;
        this.significado = significado;
        this.tipoDeFlor = tipoDeFlor;
    }

    public Flor(String nome, int id, int preco, int qntEstoque, String cor, String origem, TipoFlor tipoDeFlor) {
        super(nome, id, preco, qntEstoque);
        this.cor = cor;
        this.origem = origem;
        this.tipoDeFlor = tipoDeFlor;

    }

    @Override
    public String toString() {
        return "Flor{" +
                "cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", significado='" + significado + '\'' +
                ", tipoDeFlor=" + tipoDeFlor +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qntEstoque=" + qntEstoque +
                '}';
    }

    @Override
    public double valorComDesconto(int qntVendida) {

        if (qntVendida >= 3) {
            return (this.getPreco()*qntVendida)*0.95;
        } else {
            return this.getPreco()*qntVendida;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public TipoFlor getTipoDeFlor() {
        return tipoDeFlor;
    }

    public void setTipoDeFlor(TipoFlor tipoDeFlor) {
        this.tipoDeFlor = tipoDeFlor;
    }

}
