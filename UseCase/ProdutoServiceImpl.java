package UseCase;

import Modelo.Produto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProdutoServiceImpl implements ProdutoService{
    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository){
        this.repository = repository;
    }

    @Override
    public void cadastrarProduto(String nome, double preco, String codigo) {
        Produto produto = new Produto(nome, preco, codigo);
        repository.salvar(produto);
    }

    @Override
    public void alterarPreco(String codigo, double novoPreco) {
        Produto produto = repository.encontrarPorCod(codigo);
        produto.setPreco(novoPreco);
        repository.salvar(produto);
    }
}
