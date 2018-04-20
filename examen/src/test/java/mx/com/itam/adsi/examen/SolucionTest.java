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
		Solucion s = new Solucion();
		s.ok();
		
		Node n1 = new Node("A");
	    Node n2 = new Node("B");
	    Node n3 = new Node("C");
	    Node n4 = new Node("D");
	    Node n5 = new Node("E");
	    Node n6 = new Node("F");
	    n1.setNext(n2);
	    n2.setNext(n3);
	    n3.setNext(n4);
	    n4.setNext(n5);
	    n5.setNext(n6);
	    
		assertTrue("Prueba A",check(n1.getData(), "A"));
		assertTrue("Prueba A",!check(n1.getData(), "AC"));
		assertTrue("Prueba A",check(n2.getData(), "B"));
		assertTrue("Prueba A",!check(n2.getData(), "A"));
		assertTrue("Prueba A",!check(n1.getData(), "C"));
		assertTrue("Prueba A",check(n3.getData(), "C"));
		assertTrue("Prueba A",!check(n3.getData(), "A"));
		assertTrue("Prueba A",check(n4.getData(), "D"));
		assertTrue("Prueba A",!check(n4.getData(), "A"));
		assertTrue("Prueba A",check(n5.getData(), "E"));
		assertTrue("Prueba A",!check(n5.getData(), "A"));
		assertTrue("Prueba A",check(n6.getData(), "F"));
		assertTrue("Prueba A",!check(n6.getData(), "A"));
		assertTrue("Prueba A",check(n1.getNext().getData(), "B"));
		assertTrue("Prueba A",check(n2.getNext().getData(), "C"));
		assertTrue("Prueba A",check(n3.getNext().getData(), "D"));
		assertTrue("Prueba A",check(n4.getNext().getData(), "E"));
		assertTrue("Prueba A",check(n5.getNext().getData(), "F"));
	}
	
	private boolean check(String res, String exp) {
		return res.equals(exp);
	}

}
