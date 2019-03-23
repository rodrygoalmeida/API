package br.com.vv.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Pedido extends Base {
	private String nomeCliente;
	private String nomeFilial;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public List<ItemPedido> getItens() {
		return itens;
	}
	
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeFilial() {
		return nomeFilial;
	}
	
	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}
	
	public BigDecimal getValor() {
		BigDecimal total = BigDecimal.ZERO;
		for (ItemPedido itensPedido : itens) {
			total =total.add(BigDecimal.valueOf(itensPedido.getQuantidade()).multiply(itensPedido.getValor()));
		}
		return total;
	}
	
}
