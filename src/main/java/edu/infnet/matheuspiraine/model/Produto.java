package edu.infnet.matheuspiraine.model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "";
        }else {
            this.nome = nome;
        }

    }
    public String getNome() { return nome;}
    public void setPreco(double preco) {
        if (preco <= 0) {
            this.preco = 0.0;
        }
        this.preco = preco;
    }
    public double getPreco() {return preco;}
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = Math.max(quantidadeEstoque, 0);

    }
    public int getQuantidadeEstoque() { return quantidadeEstoque;}
    public void imprimirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }
}

