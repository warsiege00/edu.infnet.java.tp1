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
public class Produto {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    @ManyToMany
    private Collection<Estoque> estoques;

    public Produto(){}

    public Produto(String nome, Double preco){
        this();
        this.nome = nome;
        this.preco = preco;
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

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double getPreco() {return preco;}

    public void setEstoque(Collection<Estoque> estoques) {
        this.estoques = estoques;
    }
    public Collection<Estoque> getEstoque() {return estoques;}

    public void imprimirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

}

