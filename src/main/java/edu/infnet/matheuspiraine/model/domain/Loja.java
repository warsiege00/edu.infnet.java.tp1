package edu.infnet.matheuspiraine.model.domain;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Transient
    private Endereco endereco;
    @Transient
    private Collection<Estoque> estoque;

    public Loja(){}

    public Loja(String nome){
        this.nome = nome;
    }

    public Loja(String nome, Endereco endereco){
        this(nome);
        this.endereco = endereco;
    }

    public Loja(String nome, Endereco endereco, Estoque estoque){
        this(nome, endereco);
        this.estoque.add(estoque);
    }

    
}
