package edu.infnet.matheuspiraine.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.infnet.matheuspiraine.model.domain.Produto;
import edu.infnet.matheuspiraine.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void criar(Produto produto){
        produtoRepository.save(produto);
    }

    public Collection<Produto> obterTodos(){
        return (Collection<Produto>) produtoRepository.findAll();
    }
}
