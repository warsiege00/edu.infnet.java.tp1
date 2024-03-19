package edu.infnet.matheuspiraine.clients;

import edu.infnet.matheuspiraine.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {

    @GetMapping("/{cep}/json/")
    Endereco obterPorCep(@PathVariable String cep);
}