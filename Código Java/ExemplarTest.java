import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestExemplar {

	private Exemplar exemplar;

	@Before
	public void setUp() {
		exemplar = new Exemplar();
		exemplar.Exemplar(0, 0, 0, 0, 0, 0);
	}

	@Test
	public void testCriaExemplar() {
		assertEquals(0, exemplar.getEmprestado());
	}

	@Test
	public void testAlterarStatus() {
		exemplar.alterarStatus(1);
		assertEquals(1, exemplar.getEmprestado());
	}
}
