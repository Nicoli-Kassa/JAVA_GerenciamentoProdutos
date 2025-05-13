package UseCase;

public interface ProdutoService {
    void cadastrarProduto(String nome, double preco, String codigo);
    void alterarPreco(String codigo, double novoPreco);
}
