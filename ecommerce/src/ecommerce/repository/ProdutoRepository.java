package ecommerce.repository;

import ecommerce.model.Produto;
import java.util.List;


public interface ProdutoRepository {
	
	/*****CRUD dos produtos****/
	
	public Produto listarPorID(int numero);
	public List<Produto> listarTodosProdutos(int numero, String nomeProduto, float preco);
	public void cadastrar(Produto Produto);
	public void atualizar(Produto Produto);
	public void deletar(Produto Produto);
	
	/*****Métodos dos Produtos****/
	
	public List<Produto> buscarPorNome(String Nome);
	public List<Produto> buscarPorPreco(float precoMinimo, float precoMaximo);

}
