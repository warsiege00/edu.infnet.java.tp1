package edu.infnet.matheuspiraine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.infnet.matheuspiraine.clients.IEnderecoClient;
import edu.infnet.matheuspiraine.model.domain.Endereco;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    // @Autowired
    // private IEnderecoClient enderecoClient;
    
    // @GetMapping(value = "/{cep}")
	// public Endereco obterPorCep(@PathVariable String cep) {
	// 	return enderecoClient.obterPorCep(cep);
	// }

}
