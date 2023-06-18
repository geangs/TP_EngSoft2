import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestProfessor {
	
	@Test
	public void testReservaTitulo() {
		UsuarioCadastrado usuario = new UsuarioCadastrado();
		usuario.reservaTitulo("Pequeno Principe");
		assertEquals("Pequeno Principe", usuario.consultarTitulosReservados());
	}
}