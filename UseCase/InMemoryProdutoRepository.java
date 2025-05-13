package UseCase;

import Modelo.Produto;

import java.util.*;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private final Map<String, Produto> storage = new HashMap<>();

    public void salvar(Produto produto){
        storage.put(produto.getCodigo(), produto);
    }
    public Produto encontrarPorCod(String codigo) {
        return storage.get(codigo);
    }
    public List<Produto> listarProdutos() {
        return new ArrayList<>(storage.values());
    }

}
