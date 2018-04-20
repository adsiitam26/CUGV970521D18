package mx.com.itam.adsi.examen;

/**
 * Clase que despliega la solucion a una secuencia de nodos en consola.
 * @author Victor Cruz
 *
 */
public class Solucion {
	/**
	 * Instancia que construye una coleccion de nodos que están conextados
	 * secuencialmente por medio de su propiedad next.
	 * 
	 * @return Node Regresa el primero que se creó.
	 */
	private Node build() {
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
	    return n1;
	}

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba.
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.setNext(d);
        c = c.gus();
        c.prn();   
    }

    /**
     * Metodo que despliega la en consola los datos que uno requiere observar.
     * @param argv Cadena para desplegar en consola.
     */
    public static void main(String...argv) {
        new Solucion().ok();
    }

}
