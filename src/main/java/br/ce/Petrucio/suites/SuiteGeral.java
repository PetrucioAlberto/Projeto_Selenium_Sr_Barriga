package br.ce.Petrucio.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.Petrucio.core.DriverFactory;
import br.ce.Petrucio.pages.LoginPage;
import br.ce.Petrucio.tests.ContaTest;
import br.ce.Petrucio.tests.MovimentacaoTest;
import br.ce.Petrucio.tests.RemoverMovimentacaoContaTest;
import br.ce.Petrucio.tests.ResumoTest;
import br.ce.Petrucio.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("petruciolima2406@hotmail.com");
		page.setSenha("1234");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}
