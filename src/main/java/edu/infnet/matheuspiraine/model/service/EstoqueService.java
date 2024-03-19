package edu.infnet.matheuspiraine.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import edu.infnet.matheuspiraine.model.domain.Estoque;
import edu.infnet.matheuspiraine.model.repository.EstoqueRepository;


@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;
  
    public void criar(Estoque estoque){
        estoqueRepository.save(estoque);
    }

    public List<Estoque> obterTodos(){
        return (List<Estoque>) estoqueRepository.findAll();
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

}
