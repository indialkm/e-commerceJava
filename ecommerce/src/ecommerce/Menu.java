package ecommerce;

import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Produto;
import ecommerce.model.ProdutoEletronico;
import ecommerce.model.ProdutoVestuario;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		int quantidade, numero, categoria, escolha;
		float preco, menorPreco, maiorPreco;
		String nomeProduto, cor, marca, modelo, nome;

//		Produto p1 = new Produto(1,"Camisa do Bob", 30.1f , 10,"Amarela");
//		p1.descricao();
//		ProdutoEletronico p2 = new ProdutoEletronico(2,"Celular", 3000.50f, 10,"Preto","Samsung");
//		p2.descricao();
//		ProdutoVestuario p3 = new ProdutoVestuario(3, "Brusinha do Patrick Estrela", 40.79f, 6,"Branca", "Renner");
//		p3.descricao();

		ProdutoController produto = new ProdutoController();

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("                                                   |");
			System.out.println("                    E-GEN                          |");
			System.out.println("           O melhor E-commerce do Brasil           |");
			System.out.println("                                                   |");
			System.out.println("----------------------------------------------------");
			System.out.println("                                                   |");
			System.out.println("           1 - Listar todos os produtos            |");
			System.out.println("           2 - Listar por ID			   |");
			System.out.println("           3 - Cadastrar produto		   |");
			System.out.println("           4 - Atualizar produto		   |");
			System.out.println("           5 - Deletar produto			   |");
			System.out.println("           6 - Sair			   |");
			System.out.println("----------------------------------------------------");
			System.out.println("                                                   |");
			System.out.println("Entre com a opção desejada:                        |");
			System.out.println("                                                   |");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nE-GEN - O melhor E-commerce do Brasil!");
				sobre();
				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1 -> {
				System.out.println("\nLista de todos os produtos\n");

				System.out.println(
						"Seleciona a opção: \n| 1 | - Listar todos os produtos \n| 2 | - Procurar por nome\n| 3 | - Procurar por preço");
				escolha = leia.nextInt();
				leia.nextLine();

				switch (escolha) {
				case 1 -> produto.listarTodosProdutos();
				case 2 -> {
					System.out.println("\nDigite o nome do seu produto ");
					nomeProduto = leia.nextLine();
					produto.buscarPorNome(nomeProduto);
				}

				case 3 -> {
					System.out.println("\nDigite o menor preço: ");
					maiorPreco = leia.nextFloat();

					System.out.println("\nDigite o maior preço: ");
					menorPreco = leia.nextFloat();

					produto.buscarPorPreco(maiorPreco, menorPreco);

				}
				}

				keyPress();
				break;

			}

			case 2 -> {
				System.out.println("\nListar por ID\n");

				System.out.println("\nDigite o ID do produto ");
				numero = leia.nextInt();

				produto.listarPorID(numero);

				keyPress();
				break;

			}

			case 3 -> {
				System.out.println("\nCadastrar Produto\n");
				leia.nextLine();
				System.out.println("\nDigite o nome do seu produto ");
				nome = leia.nextLine();

				System.out.println("\nDigite o preço do seu produto: ");
				preco = leia.nextFloat();

				System.out.println("\nDigite a quantidade que tem na loja: ");
				quantidade = leia.nextInt();
				leia.nextLine();

				System.out.println("\nDigite a cor do seu produto");
				cor = leia.nextLine();

				do {
					System.out
							.println("\nDigite a categoria do seu produto: \n| 1 | - Vestuário \n| 2 | - Eletronico ");

					categoria = leia.nextInt();
					leia.nextLine();

				} while (categoria <= 1 && categoria >= 2);

				switch (categoria) {
				case 1 -> {
					System.out.println("\nDigite a marca do seu produto: ");
					marca = leia.nextLine();
					produto.cadastrar(new ProdutoVestuario(produto.gerarNumero(), nome, preco, quantidade, cor, marca));

				}
				case 2 -> {
					System.out.println("\nDigite o modelo do seu produto: ");
					modelo = leia.nextLine();

					produto.cadastrar(
							new ProdutoEletronico(produto.gerarNumero(), nome, preco, quantidade, cor, modelo));
				}

				}

				keyPress();
				break;

			}

			case 4 -> {
				System.out.println("\nAtualizar produto\n");

				System.out.println("Digite o ID do produto: ");
				numero = leia.nextInt();

				var buscaProduto = produto.buscarNaCollection(numero);

				if (buscaProduto != null) {

					leia.nextLine();
					System.out.println("\nDigite o nome do seu produto ");
					nome = leia.nextLine();

					System.out.println("\nDigite o preço do seu produto: ");
					preco = leia.nextFloat();

					System.out.println("\nDigite a quantidade que tem na loja: ");
					quantidade = leia.nextInt();
					leia.nextLine();

					System.out.println("\nDigite a cor do seu produto");
					cor = leia.nextLine();

					do {
						System.out.println(
								"\nDigite a categoria do seu produto: \n| 1 | - Vestuário \n| 2 | - Eletronico ");

						categoria = leia.nextInt();
						leia.nextLine();

					} while (categoria <= 1 && categoria >= 2);

					switch (categoria) {
					case 1 -> {
						System.out.println("\nDigite a marca do seu produto: ");
						marca = leia.nextLine();
						produto.atualizar(new ProdutoVestuario(numero, nome, preco, quantidade, cor, marca));

					}
					case 2 -> {
						System.out.println("\nDigite o modelo do seu produto: ");
						modelo = leia.nextLine();

						produto.atualizar(new ProdutoEletronico(numero, nome, preco, quantidade, cor, modelo));
					}

					}

				} else {
					System.out.println("Produto não foi encontrada!");
				}

				keyPress();
				break;

			}

			case 5 -> {
				System.out.println("\nDeletar produto");
				
				System.out.println("Digite o ID do produto:  ");
				numero = leia.nextInt();
				
				produto.deletar(numero);

				keyPress();
				break;

			}

			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Ingrid Alkimim\n");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
