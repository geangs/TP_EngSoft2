import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PeriodicoTest {
	
	@Test
	public void testPeriodicoCadastro() {
		Periodico periodico = new Periodico();
		periodico.Periodico("20/11/2020", 3, 5.5);
		assertEquals("20/11/2020", periodico.getDiaContratado());
		assertEquals(3, periodico.getPeriodo());
		assertEquals(5.5, periodico.getValor(), 0.01);
	}
}
