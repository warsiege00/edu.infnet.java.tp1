package edu.infnet.matheuspiraine.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProdutoTest {
    private Produto produto;

    @BeforeEach
    public void setUp(){
        produto = new Produto();
        produto.setId(1);
        produto.setNome("Produto Teste");
        produto.setPreco(10.0);
        produto.setQuantidadeEstoque(20);
    }

    @Test
    public void verificaNomeNaoNull() {
        produto.setNome(null);
        assertEquals("", produto.getNome());
    }
    @Test
    public void valorPrecoValido() {
        produto.setPreco(100);
        assertEquals(100, produto.getPreco());
    }
    @Test
    public void verificaValorTotalEstoque() {
        assertEquals(200.0, produto.calcularValorTotalEstoque());
    }
    @Test
    public void estoqueNaoPodeSerMenorQueZero() {
        produto.setQuantidadeEstoque(-10);
        assertEquals(0, produto.getQuantidadeEstoque());
    }



}
