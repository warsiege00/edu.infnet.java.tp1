package edu.infnet.matheuspiraine.model.domain;

import java.util.Collection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.transaction.Transactional;



@Entity
@Transactional
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    // @Transient
    // private Loja loja;
    @ManyToMany(mappedBy = "estoques") // Especifica o campo na classe Produto que mapeia a relação
    private Collection<Produto> produtos;
    private String descricao;

    public Estoque(){}

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() { return nome;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() { return descricao;}
    
    public Collection<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        produto.getEstoque().add(this);
    }
    //CALCULAR VALOR TOTAL ESTOQUE
}
