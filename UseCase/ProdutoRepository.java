package UseCase;

import Modelo.Produto;

import java.util.List;

public interface ProdutoRepository {
    void salvar(Produto produto);
    Produto encontrarPorCod(String codigo);
    List<Produto> listarProdutos();
}
