package edu.infnet.matheuspiraine.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @GetMapping(value = "/listar")
	public Collection<String> obterLista(){
		return null;
	}
    @GetMapping(value = "/")
	public String obter(){
		return "null";
	}

}
