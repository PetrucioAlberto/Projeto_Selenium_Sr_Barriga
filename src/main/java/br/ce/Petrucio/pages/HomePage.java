package br.ce.Petrucio.pages;

import br.ce.Petrucio.core.BasePage;

public class HomePage extends BasePage {

	public String obterSaldoConta(String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
}
