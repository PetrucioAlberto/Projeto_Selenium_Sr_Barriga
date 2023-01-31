package br.ce.Petrucio.pages;

import br.ce.Petrucio.core.BasePage;
import br.ce.Petrucio.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://seubarriga.wcaquino.me/login");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Entrar");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}
