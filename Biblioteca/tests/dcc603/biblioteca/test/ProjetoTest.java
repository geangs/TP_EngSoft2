package dcc603.biblioteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.biblioteca.Projeto;

public class ProjetoTest {
	
	@Test
	public void testFecharProjetoPassa(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoCerto() );
	}
	
	@Test
	public void testFecharProjetoFalha(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoErrado() );
	}
	
}
