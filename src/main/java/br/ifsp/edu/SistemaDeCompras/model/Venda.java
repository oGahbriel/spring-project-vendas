package br.ifsp.edu.SistemaDeCompras.model;

public class Venda {
	
	private String nomeCliente;
	private String nomeProduto;
	private double valor;
	private int quantidade;

	public double getValorBruto() {
		return quantidade  * valor;
	}
	public String getPercentualDesconto() {
		if (getValorBruto() < 500) {
			return "-";
		}else if(getValorBruto() <= 1000) {
				return "5%";
			}else {
				return "10%";
			}
	}
	public double getValorFinal() {
		if (getValorBruto() < 500) {
			return getValorBruto();
		}else if (getValorBruto()<= 1000) {
			return getValorBruto() * 0.95;
		}else {
			return getValorBruto() * 0.90;
		}
	}
	
	public String getClassificacao() {
		if (getValorFinal( )<= 400) {
			return "Compra Comum";
		}else if (getValorFinal()<= 900) {
			return "Compra  Especial";
		}else {
			return "Compra Premium";
		}
	}
		public String getNomeCliente() {
			return nomeCliente;
		}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
