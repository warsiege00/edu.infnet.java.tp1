package edu.infnet.matheuspiraine.model.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "idEstoque")
    private List<Produto> produtos;
    private String descricao;

    public Estoque(){}

    public Estoque(String nome){
        this();
        setNome(nome);
    }

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
    
    public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
