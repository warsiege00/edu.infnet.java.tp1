package edu.infnet.matheuspiraine.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import edu.infnet.matheuspiraine.model.domain.Estoque;
import edu.infnet.matheuspiraine.model.domain.Produto;
import edu.infnet.matheuspiraine.model.repository.EstoqueRepository;
import edu.infnet.matheuspiraine.model.repository.ProdutoRepository;


@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public void criar(Estoque estoque){
        estoqueRepository.save(estoque);
    }

    public Collection<Estoque> obterTodos(){
        return (Collection<Estoque>) estoqueRepository.findAll();
    }

    public Estoque obterPorId(Integer id){
        Estoque estoque = estoqueRepository
            .findById(id)
            .orElseThrow(EntityNotFoundException::new);
            return estoque;
    }

    public void excluir(Integer id){
        estoqueRepository.deleteById(id);
    }

    public Collection<Produto> obterProdutos(Integer estoqueId){
        Estoque estoque = estoqueRepository
            .findById(estoqueId)
            .orElseThrow(EntityNotFoundException::new);
            
        return estoque.getProdutos();
    }

    public void adicionarProdutoAoEstoque(Integer estoqueId, Integer produtoId) {
        Estoque estoque = estoqueRepository
            .findById(estoqueId)
            .orElseThrow(EntityNotFoundException::new);
        Produto produto = produtoRepository
            .findById(produtoId)
            .orElseThrow(EntityNotFoundException::new);

        estoque.adicionarProduto(produto);
        estoqueRepository.save(estoque);
    }
    
}
