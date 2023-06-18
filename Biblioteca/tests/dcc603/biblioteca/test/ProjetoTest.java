package dcc603.biblioteca.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dcc603.biblioteca.Projeto;

public class ProjetoTest {
	
	@Test
	public void testFecharProjetoPassa() {
		Projeto projeto = new Projeto();
		projeto.fecharProjeto();
		assertTrue("O projeto deveria estar fechado.", projeto.isProjetoFechado());
	}
	
	@Test
	public void testFecharProjetoFalha() {
		Projeto projeto = new Projeto();
		projeto.fecharProjeto();
		assertFalse("O projeto não deveria estar fechado incorretamente.", projeto.isProjetoFechado());
	}
}