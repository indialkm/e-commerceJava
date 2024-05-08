package ecommerce.model;

public class ProdutoVestuario extends Produto{

	private String modelo;
	

	public ProdutoVestuario(int id, String nomeDoProduto, float precoDoProduto, int quantidade,String cor, String modelo) {
		super(id, nomeDoProduto, precoDoProduto, quantidade,cor);
		this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
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
		System.out.println("Marca: " + this.modelo);
		System.out.println("                                                    ");
		System.out.println("----------------------------------------------------");
		
	}



}
