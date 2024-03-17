package edu.infnet.matheuspiraine.model.domain;

import java.util.Collection;

public class Loja {
    private Integer id;
    private String nome;
    private Endereco endereco;
    private Collection<Estoque> estoque;

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
