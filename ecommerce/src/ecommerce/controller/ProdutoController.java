package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;
	
	float maiorPreco, menorPreco;

	@Override
	public void listarTodosProdutos() {

		if (!listaProdutos.isEmpty()) {
			for (Produto produto : listaProdutos) {
				produto.descricao();
			}
		} else {
			System.out.println("A lista está vazia, adicione produtos");
		}

	}

	@Override
	public void listarPorID(int numero) {
		// TODO Auto-generated method stub
		listaProdutos.stream()
		.filter(produto-> produto.getId() == numero)
		.forEach(produto ->produto.descricao());
	}

	@Override
	public void cadastrar(Produto Produto) {
		// TODO Auto-generated method stub
		listaProdutos.add(Produto);
		System.out.println("\n A conta número: " + Produto.getId() + " foi criada com sucesso!");

	}

	@Override
	public void atualizar(Produto Produto) {
		// TODO Auto-generated method stub
		var buscaProduto = buscarNaCollection(Produto.getId());
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), Produto);
			System.out.println("\nO produto com o ID: " + Produto.getId() + " foi atualizado com sucesso");
		} else {
			System.out.println("\nO produto com o ID: " + Produto.getId() + " não foi encontrada!");
		}

	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		var produto = buscarNaCollection(numero);

		if(produto != null) {
				if(listaProdutos.remove(produto) == true) {
					System.out.println("\nO produto do ID: " + numero + " foi deletado com sucesso!");
				}
			
		}else System.out.println("\n O produto do ID: " + numero + "não foi encontrado");
	}

	@Override
	public void buscarPorNome(String Nome) {
		 listaProdutos.stream()
		 .filter(produto -> produto.getNomeDoProduto().toLowerCase().startsWith(Nome.toLowerCase()))
		 .peek(produto -> produto.descricao())
		 .collect(Collectors.toList());
	
	}

	@Override
	public List<Produto> buscarPorPreco(float precoMinimo, float precoMaximo) {
		// TODO Auto-generated method stub
		listaProdutos.stream()
		.filter(produto-> produto.getPrecoDoProduto() >= precoMinimo && produto.getPrecoDoProduto() <= precoMaximo)
		.forEach(produto ->produto.descricao());
		
		return null;
	}

	public int gerarNumero() {
		return ++numero;
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getId() == numero) {
				return produto;
			}
		}

		return null;
	}

}
