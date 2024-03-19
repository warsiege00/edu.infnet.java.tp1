package edu.infnet.matheuspiraine.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.infnet.matheuspiraine.model.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


    List<Produto> findByEstoqueId(Integer estoqueId);
}