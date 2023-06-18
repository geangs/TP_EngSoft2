import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UsuarioCadastradoTest {
	
	private UsuarioCadastrado usuario;
	
	@Before
	public void setUp() {
		usuario = new UsuarioCadastrado();
	}
	
	@Test
	public void testUsuarioCadastrado() {
		usuario.UsuarioCadastrado("Maria", "11122233345");
		
		assertEquals("Maria", usuario.getNome());
		assertEquals("11122233345", usuario.getCpf());
	}
	
	@Test
	public void testConsultarStatusEmprestimo() {
		assertEquals("Pode realizar empréstimo", usuario.consultarStatusEmprestimo());
	}
	
	@Test
	public void testRealizarEmprestimo() {
		assertEquals(1, usuario.getPodeRealizarEmprestimo());
		usuario.realizarEmprestimo("Pequeno Principe");
		assertEquals(0, usuario.getPodeRealizarEmprestimo());
	}
}
