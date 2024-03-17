package edu.infnet.matheuspiraine.model.domain;

public class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public void setPreco(Double preco) {
        if (preco <= 0) {
            this.preco = 0.0;
        }
        this.preco = preco;
    }
    public Double getPreco() {return preco;}
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = Math.max(quantidadeEstoque, 0);

    }
    public Integer getQuantidadeEstoque() { return quantidadeEstoque;}
    public void imprimirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public Double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }
}

