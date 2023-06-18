import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class TestAcervo {
	
	private Acervo acervo;
	
	@Before
	public void setUp() {
		acervo = new Acervo("Pequeno Principe");
	}
	
	@Test
	public void testCriaAcervo() {
		assertEquals("Pequeno Principe", acervo.getTitulo());
	}
	
	@Test
	public void testConsultarAcervo() {
		assertNotNull(acervo.consultaAcervo());
	}
}