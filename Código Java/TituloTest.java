import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTitulo {

	@Test
	public void testCriarTitulo() {
		 
		Titulo titulo = new Titulo();
		 
		titulo.Titulo("Titulo 1", "Paulo Ricardo", 0, 0, "Um jovem...", 30); 
		 
		assertEquals("Titulo 1", titulo.novoNome);
		assertEquals("Paulo Ricardo", titulo.novoAutor);
		assertEquals(0, titulo.novoPeriodoEmprestimo);
		assertEquals(0, titulo.novoPeriodoReserva);
		assertEquals("Um jovem...", titulo.novaDescricao);
		assertEquals(30, titulo.novosExemplares);
	}
}