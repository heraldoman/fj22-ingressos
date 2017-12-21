package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {
	private Sessao sessao;
	private BigDecimal preco;
	
	/**
	 * @deprecated hibernate only
	 */
	public Ingresso() {
	}
	
	public Sessao getSessao() {
		return sessao;
	}

	public BigDecimal getPreco() {
		return preco;
	}


	public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
		super();
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
	}
	


}
