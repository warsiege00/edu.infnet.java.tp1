package edu.infnet.matheuspiraine;

import edu.infnet.matheuspiraine.model.Produto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProdutoLoader implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Melhor Cenario
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Camiseta");
        produto.setPreco(50.00);
        produto.setQuantidadeEstoque(100);
        produto.imprimirInformacoes();
        System.out.println("Valor Estoque: R$" + produto.calcularValorTotalEstoque());

        //Nome nulo
        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome(null);
        p2.setPreco(0);
        p2.setQuantidadeEstoque(0);
        p2.imprimirInformacoes();

        //Preco negativo
        Produto p3 = new Produto();
        p3.setId(2);
        p3.setNome("Preco negativo");
        p3.setPreco(-10);
        p3.setQuantidadeEstoque(0);
        p3.imprimirInformacoes();

        //Preco zerado
        Produto p4 = new Produto();
        p4.setId(2);
        p4.setNome("Preco zerado");
        p4.setPreco(0);
        p4.setQuantidadeEstoque(0);
        p4.imprimirInformacoes();

        //Estoque negativo
        Produto p5 = new Produto();
        p5.setId(2);
        p5.setNome("Preco zerado");
        p5.setPreco(100);
        p5.setQuantidadeEstoque(-10);
        p5.imprimirInformacoes();

        //Estoque zerado
        Produto p6 = new Produto();
        p6.setId(1);
        p6.setNome("Bermudas");
        p6.setPreco(80.00);
        p6.setQuantidadeEstoque(0);
        p6.imprimirInformacoes();

        //Valor Total com estoque zero
        Produto p7 = new Produto();
        p7.setId(1);
        p7.setNome("Bermudas");
        p7.setPreco(80.00);
        p7.setQuantidadeEstoque(0);
        p7.imprimirInformacoes();
        System.out.println("Valor Estoque: R$" + p7.calcularValorTotalEstoque());

        //Valor Total com estoque negativo
        Produto p8 = new Produto();
        p8.setId(1);
        p8.setNome("Bermudas");
        p8.setPreco(80.00);
        p8.setQuantidadeEstoque(-10);
        p8.imprimirInformacoes();
        System.out.println("Valor Estoque: R$" + p8.calcularValorTotalEstoque());
    }
}
