import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;
public class AdministradorTest {
	
	private Administrador administrador;
	
	@Before
	public void setUp() {
		administrador = new Administrador();
	}
	
	@Test
	public void testAdministradorCadastro() {
		administrador.Administrador("adm1", "senha123");
		
		assertEquals("adm1", administrador.getLogin());
		assertEquals("senha123", administrador.getSenha());	
	}
	
	@Test
	public void testRemoverUsuario() {
		administrador.removerUsuario("Maria");
		
		assertNotEquals("Maria", administrador.getUsuario());
	}
}