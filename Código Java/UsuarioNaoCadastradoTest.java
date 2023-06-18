import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestUsuarioNaoCadastrado {
	
	private UsuarioNaoCadastrado usuario;
	
	@Before
	public void setUp() {
		usuario = new UsuarioNaoCadastrado();
	}
	
	@Test
	public void testUsuarioNaoCadastrado() {
		usuario.UsuarioNaoCadastrado("Joao");
		
		assertEquals("Joao", usuario.getNome());
	}
	
	@Test
	public void testSolicitarCadastro() {
		usuario.solicitarCadastro("12345678912");
		
		assertEquals("Joao", usuario.getNome());
		assertEquals("12345678912", usuario.getCpf());
	}
}
