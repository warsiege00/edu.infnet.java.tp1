package edu.infnet.matheuspiraine.model.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Transactional
public class Produto {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    
    @ManyToOne
    @JoinColumn(name = "idEstoque")
    @JsonBackReference
    Estoque estoque;

    public Produto(){}

    public Produto(String nome, Double preco){
        this();
        setNome(nome);
        setPreco(preco);
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

    public Estoque getEstoque(){
        return estoque;
    }
    public void setEstoque(Estoque estoque){
        this.estoque = estoque;
    }

}

