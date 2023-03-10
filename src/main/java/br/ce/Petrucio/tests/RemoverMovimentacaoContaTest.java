package br.ce.Petrucio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.Petrucio.core.BaseTest;
import br.ce.Petrucio.core.Propriedades;
import br.ce.Petrucio.pages.ContasPage;
import br.ce.Petrucio.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}
