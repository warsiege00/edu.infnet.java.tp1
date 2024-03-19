package edu.infnet.matheuspiraine.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import edu.infnet.matheuspiraine.model.domain.Produto;
import edu.infnet.matheuspiraine.model.repository.ProdutoRepository;


@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void criar(Produto produto){
        produtoRepository.save(produto);
    }

    public List<Produto> obterProdutosPorEstoque(Integer estoqueId){
        return (List<Produto>) produtoRepository
            .findByEstoqueId(estoqueId);
    }
    

    public Produto obterPorId(Integer id){
        Produto produto = produtoRepository
            .findById(id)
            .orElseThrow(EntityNotFoundException::new);
            return produto;
    }
    public void excluir(Integer id){
        produtoRepository.deleteById(id);
    }
}
