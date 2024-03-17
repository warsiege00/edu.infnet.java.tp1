package edu.infnet.matheuspiraine.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.infnet.matheuspiraine.model.domain.Estoque;

@Repository
public interface EstoqueRepository extends CrudRepository<Estoque, Integer> {

}