package br.com.laura.floricultura.dominio;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected int qntEstoque;

    public Produto(String nome, int id, double preco, int qntEstoque) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }

    public abstract void desconto(int qntVendida);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
}
