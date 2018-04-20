package mx.com.itam.adsi.examen;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolucionTest {
	private final static Logger LOG = Logger.getLogger(Solucion.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.info("Incializando la clase");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.info("Finalizando la clase");
	}

	@Before
	public void setUp() throws Exception {
		LOG.info("Incializando la prueba");
	}

	@After
	public void tearDown() throws Exception {
		LOG.info("Finalizando la prueba");
	}

	@Test
	public void test() {
		new Solucion().ok();
	}

}
