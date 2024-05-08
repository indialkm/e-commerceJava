package ecommerce;

import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

import ecommerce.model.Produto;
import ecommerce.model.ProdutoEletronico;
import ecommerce.model.ProdutoVestuario;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		
		Produto p1 = new Produto(1,"Camisa do Bob", 30.1f , 10,"Amarela");
		p1.descricao();
		ProdutoEletronico p2 = new ProdutoEletronico(2,"Celular", 3000.50f, 10,"Preto","Samsung");
		p2.descricao();
		ProdutoVestuario p3 = new ProdutoVestuario(3, "Brusinha do Patrick Estrela", 40.79f, 6,"Branca", "Renner");
		p3.descricao();
		
		
		

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
			
			if(opcao == 6) {
				System.out.println("\nE-GEN - O melhor E-commerce do Brasil!");
				sobre();
				leia.close();
				System.exit(0);
				
			}
			
			switch(opcao) {
			
			case 1->{
				System.out.println("\nLista de todos os produtos\n");
				
				keyPress();
				break;
				
			}
			
			case 2->{
				System.out.println("\nListar por ID\n");
				
				keyPress();
				break;
				
			}
			
			case 3->{
				System.out.println("\nCadastrar Produto\n");
				
				keyPress();
				break;
				
			}
			
			case 4->{
				System.out.println("\nAtualizar produto\n");
				
				keyPress();
				break;
				
			}
			
			case 5->{
				System.out.println("\nDeletar produto");
				
				keyPress();
				break;
				
			}
			
			
			}
			

		}
	}
	
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Ingrid Alkimim");
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
