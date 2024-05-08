package ecommerce.model;

public class ProdutoEletronico extends Produto{

	private String marca;
	public ProdutoEletronico(int id, String nomeDoProduto, float precoDoProduto, int quantidade, String cor, String marca) {
		super(id, nomeDoProduto, precoDoProduto, quantidade,cor);
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void descricao(){
		System.out.println("----------------------------------------------------");
		System.out.println("                                                    ");
		System.out.println(" Descrição do produto:                              ");
		System.out.println("                                                    ");
		System.out.println("ID do Produto: " + getId());
		System.out.println("Nome do Produto: " + getNomeDoProduto());
		System.out.println("Preco do produto: " + getPrecoDoProduto());
		System.out.println("Quantidade do produto: " + getQuantidade());
		System.out.println("Cor do produto: " + getCor());
		System.out.println("Modelo: " + this.marca);
		System.out.println("                                                    ");
		System.out.println("----------------------------------------------------");
		
	}
	

}
