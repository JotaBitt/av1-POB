package av1Pob;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Produto id, valor, nome
		// Carrinho = pai e itens carrinho = filho
		// Carrinho = frete e nome/id do usuário, valor total
		// Itens carrinho = informações do produto, id Item, Id Produto,qtde
		int op, idProd, qtde, i=0;
		Carrinho carrinho = new Carrinho();
		Scanner sc = new Scanner(System.in);
		
		carrinho.criarProduto();

		
		do {
			System.out.println("Menu");
			System.out.println("1 - Adicionar Produto ao carrinho");
			System.out.println("2 - Exibir Produtos");
			System.out.println("3 - Ver Carrinho e finalizar compra");
			
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				i++;
				System.out.printf("Coloque o id do produto: ");
				idProd = sc.nextInt();
				
				System.out.printf("\nColoque a quantidade: ");
				qtde = sc.nextInt();
				
				carrinho.criaItem(idProd, i, qtde);
				break;
				
			case 2:
				carrinho.listarProdutos(carrinho.getProdutos());
				break;
			}
			
		} while(op != 3);
		
		carrinho.exibirCarrinho(carrinho.getListaItens());
		
		sc.close();
	}
		
}
