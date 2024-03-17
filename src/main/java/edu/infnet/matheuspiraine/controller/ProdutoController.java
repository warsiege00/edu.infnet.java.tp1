package edu.infnet.matheuspiraine.controller;

import java.util.Collection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.infnet.matheuspiraine.model.domain.Produto;
import edu.infnet.matheuspiraine.model.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/criar")
    public void criar(@RequestBody Produto produto){
        produtoService.criar(produto);
    }

    @GetMapping(value = "/listar")
	public Collection<Produto> obterLista(){
		return produtoService.obterTodos();
    }


}
