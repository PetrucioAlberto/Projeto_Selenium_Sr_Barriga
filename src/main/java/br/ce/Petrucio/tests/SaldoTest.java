package br.ce.Petrucio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.Petrucio.core.BaseTest;
import br.ce.Petrucio.core.Propriedades;
import br.ce.Petrucio.pages.HomePage;
import br.ce.Petrucio.pages.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}
}
