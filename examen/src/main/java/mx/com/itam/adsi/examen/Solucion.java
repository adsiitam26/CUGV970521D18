package mx.com.itam.adsi.examen;

import org.apache.log4j.Logger;

/**
 * Clase que despliega la solucion a una secuencia de nodos en consola.
 * @author Victor Cruz
 *
 */
public class Solucion {
	private final static Logger LOG = Logger.getLogger(Solucion.class);

	/**
	 * Instancia que construye una coleccion de nodos que están conextados
	 * secuencialmente por medio de su propiedad next.
	 * 
	 * @return Node Regresa el primero que se creó.
	 */
	private Node build() {
		LOG.info("Inicializando Construccion de nodos, de A a F");
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
	    LOG.info("Terminó de hacer todas las conextiones entre nodos A a F");
	    return n1;
	}

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba.
     */
    public void ok() {
    	LOG.info("Checando si todas las clases son correctas");
    	LOG.info("Creamos un nodo a con build()");
        Node a = build();
        a.prn();
        LOG.info("Creamos un nodo a con gus()");
        a = a.gus();
        a.prn();
        LOG.info("Creamos un nodo a con gus()");
        a = a.gus();
        a.prn();
        LOG.info("Creamos un nodo a con gus()");
        LOG.info("Primera prueba con el metodo gus");
        
        LOG.info("Instanceamos un nodo b");
        Node b = new Node("X");
        b = b.gus();
        LOG.info("Creamos un nodo b con gus()");
        b.prn();
        LOG.info("Segunda prueba con el metodo gus con una nueva Letra");
        
        LOG.info("Instanceamos un nodo X y Y");
        Node c = new Node("X");
        Node d = new Node("Y");
        c.setNext(d);
        c = c.gus();
        c.prn();   
        LOG.info("Creamos un nodo c con gus()");
        LOG.info("Tercera prueba con el metodo gus con X y Y");
    }

    /**
     * Metodo que despliega la en consola los datos que uno requiere observar.
     * @param argv Cadena para desplegar en consola.
     */
    public static void main(String...argv) {
        new Solucion().ok();
    }

}
