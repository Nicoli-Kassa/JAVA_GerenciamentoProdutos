import UseCase.InMemoryProdutoRepository;
import UseCase.ProdutoRepository;
import UseCase.ProdutoService;
import UseCase.ProdutoServiceImpl;
import Modelo.Produto;

public class ConsoleApp {
    public static void main(String[] args) {
        ProdutoRepository repo = new InMemoryProdutoRepository();
        ProdutoService service = new ProdutoServiceImpl(repo);

        System.out.println("Produto com preço inicial: ");
        service.cadastrarProduto("Sabonete", 6.99, "1");
        Produto produto = repo.encontrarPorCod("1");
        System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco());

        System.out.println("\nProduto com preço alterado: ");
        service.alterarPreco("1", 5.45);
        produto = repo.encontrarPorCod("1");
        System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco());


        service.cadastrarProduto("Shampoo", 5.68, "2");
        service.cadastrarProduto("Condicionador", 3.99, "3");


        System.out.println("\nLista de todos os produtos: ");
        for (Produto p : repo.listarProdutos()) {
            System.out.println("Produto: " + p.getNome() + " | Preço: " + p.getPreco());
        }
    }
}

