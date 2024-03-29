package edu.infnet.matheuspiraine.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.infnet.matheuspiraine.model.domain.Estoque;
import edu.infnet.matheuspiraine.model.service.EstoqueService;


@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping(value = "/criar")
    public void criar(@RequestBody Estoque estoque){
        estoqueService.criar(estoque);
    }

    @GetMapping(value = "/listar")
	public List<Estoque> obterLista(){
		return estoqueService.obterTodos();
    }

    @GetMapping(value = "/{id}")
	public Estoque obterPorId(@PathVariable Integer id){
		return estoqueService.obterPorId(id);
    }

    @DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		estoqueService.excluir(id);
    }

}
