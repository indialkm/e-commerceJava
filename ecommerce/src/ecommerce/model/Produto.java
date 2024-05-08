package ecommerce.model;

public class Produto {
	
	private int Id;
	private String nomeDoProduto;
	private float precoDoProduto;
	private int quantidade;
	private String cor;
	

	public Produto(int id, String nomeDoProduto, float precoDoProduto, int quantidade, String cor) {
		super();
		Id = id;
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
		this.quantidade = quantidade;
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}

	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public float getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(float precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public void descricao(){
		System.out.println("----------------------------------------------------");
		System.out.println("                                                    ");
		System.out.println(" Descrição do produto:                              ");
		System.out.println("                                                    ");
		System.out.println("ID do Produto: " + this.Id);
		System.out.println("Nome do Produto: " + this.nomeDoProduto);
		System.out.println("Preco do produto: " + this.precoDoProduto);
		System.out.println("Quantidade do produto: " + this.quantidade);
		System.out.println("Cor do produto: " + this.cor);
		System.out.println("                                                    ");
		System.out.println("----------------------------------------------------");
		
	}
	

}
