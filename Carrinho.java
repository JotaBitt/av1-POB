package av1Pob;

import java.util.ArrayList;

public class Carrinho {

	public ArrayList<ItensCarrinho> listaItens;
	public double valorTotal;
	public ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void criarProduto() {
		Produto prod = new Produto(1, "Sabão Crá Crá", 3.49); 
		produtos.add(prod);
		
		prod = new Produto(2, "Gravatinha", 12.89);
		produtos.add(prod);
		
		prod = new Produto(3, "Clear man", 9.20);
		produtos.add(prod);
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<ItensCarrinho> getListaItens() {
		return listaItens;
	}

	public Carrinho() {
		ArrayList<ItensCarrinho> listaProd = new ArrayList<ItensCarrinho>();
		this.listaItens = listaProd;
	}
	
	public ItensCarrinho criaItem(int idProd, int idItem, int qtde) {
		
		ItensCarrinho item = new ItensCarrinho();
		item.setIdItem(idItem);
		item.setIdProduto(idProd);
		item.setQtde(qtde);
		listaItens.add(item);
		System.out.println("Produto Inserido ao carrinho");
		return item;
	}
	
	public void listarProdutos (ArrayList<Produto> produtos) {
		for(Produto prod: produtos) {
			System.out.println("\nId: " + prod.getId() +"\nNome: " + prod.getNome() + "\nValor: " + prod.getValor());
		}
	}
	
	public void exibirCarrinho(ArrayList<ItensCarrinho> listaProd) {
		
		this.valorTotal=0;
		if (listaProd == null) {
			System.out.println("Carrinho vazio.");
		}
		System.out.println("Itens no carrinho: ");
		for(ItensCarrinho item: listaProd) {
			
			valorTotal = valorTotal + consultaPreco(item.getIdProduto(), item.getQtde());
			
			System.out.println("Id produto: " + item.getIdProduto());
		}
		System.out.println("Valor total: " + this.valorTotal);
	}
	
	public double consultaPreco(int id, int qtde) {
		
		double valorFinal=0;
		
		for (Produto prod: produtos) {
			if (id == prod.getId()) {
				valorFinal = prod.getValor() * qtde;
			}
		}
		return valorFinal;
	}
}
