# Gerenciamento de Produtos - Arquitetura Hexagonal

Este projeto implementa um sistema simples de gerenciamento de produtos utilizando a **arquitetura hexagonal**. O sistema permite cadastrar e alterar o preço de produtos, utilizando um repositório em memória como adaptador para persistir os dados.

## Objetivos

- Criar uma aplicação com a arquitetura hexagonal.
- Gerenciar produtos com nome, preço e código.
- Implementar portas de entrada (serviços) para cadastrar e alterar preços.
- Implementar portas de saída (repositórios) para salvar e buscar produtos.
- Usar um repositório em memória para armazenar os dados.
- Criar testes unitários para validar as funcionalidades.

## Requisitos

Antes de rodar o projeto, é necessário ter o seguinte instalado:

- **Java 11+**
- **Maven** (para gerenciamento de dependências e execução do projeto)

## Estrutura do Projeto

O projeto é organizado da seguinte maneira:
```
src
├── Modelo
│ └── Produto.java 
├── UseCase
│ ├── ProdutoRepository.java 
│ ├── ProdutoService.java 
│ └── ProdutoServiceImpl.java 
│ └── InMemoryProdutoRepository.java

```


### Modelo: Produto

A classe `Produto` representa um produto com três atributos principais:

- `nome`: nome do produto.
- `preco`: preço do produto.
- `codigo`: código único para identificar o produto.

### UseCase: ProdutoRepository

A interface `ProdutoRepository` define as operações de persistência de produtos:

- `salvar(Produto produto)`: Salva o produto.
- `encontrarPorCod(String codigo)`: Busca um produto pelo seu código.
- `listarProdutos()`: Retorna todos os produtos cadastrados.

### UseCase: ProdutoService

A interface `ProdutoService` define os serviços que podem ser executados no produto:

- `cadastrarProduto(String nome, double preco, String codigo)`: Cadastra um novo produto.
- `alterarPreco(String codigo, double novoPreco)`: Altera o preço de um produto.

### UseCase: InMemoryProdutoRepository

A classe `InMemoryProdutoRepository` implementa a interface `ProdutoRepository` e utiliza uma lista em memória para armazenar os produtos.

### ConsoleApp

A classe `ConsoleApp` é o ponto de entrada da aplicação e demonstra como interagir com o sistema, cadastrando e alterando preços de produtos.
