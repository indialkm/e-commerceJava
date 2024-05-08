package ecommerce.repository;

import ecommerce.model.Produto;
import java.util.List;


public interface ProdutoRepository {
	
	/*****CRUD dos produtos****/
	
	public void listarPorID(int numero);
	public void listarTodosProdutos();
	public void cadastrar(Produto Produto);
	public void atualizar(Produto Produto);
	public void deletar(int numero);
	
	/*****Métodos dos Produtos****/
	
	public void buscarPorNome(String Nome);
	public List<Produto> buscarPorPreco(float precoMinimo, float precoMaximo);

}
