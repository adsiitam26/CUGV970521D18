package mx.com.itam.adsi.examen;

import org.apache.log4j.Logger;

/**
 * Clase que forma nodos ligados unidireccionalmente, en el cual cada
 * uno contiene una cadena con un valor característico.
 * @author Victor Cruz
 *
 */
public class Node {
	private final static Logger LOG = Logger.getLogger(Node.class);
    private String data;
    private Node next;
    
    /**
     * Constructor de la clase Node que recibe una cadena para crear un
     * nuevo nodo.
     * @param data Cadena que se asociara al nodo instanciado.
     */
    Node(String data) {
    	LOG.info("Inicializando un nuevo nodo con "+data);
        this.data = data;
        LOG.info("Terminó de crear el nodo");
    }
    
    /**
     * Método que secuencialmente obtiene los nodos que están anidados entre si
     * de forma inversa.
     * @return El otro nodo anidado al Objeto.
     */
    Node gus() {
        if(next == null) {
        	return this; // Cuando no hay mas nodos ligados a este objeto.
        }
        Node otro = next; // Obtenemos el nodo anidado.
        LOG.info("Checamos si tiene conectado un nuevo nodo");
        next = null;
        Node tavo = otro.gus(); // Obtenemos el siguiente nodo de forma "inversa".
        otro.next = this;
        return tavo; // Regresa el ultimo nodo.
    }
  
    /**
     * Obtener la informacion de su propiedad data.
     * @return El valor de data.
     */
    public String getData() {
    	LOG.info("Obteniendo data");
		return data;
	}

    /**
     * Modifica la informacion de su propiedad data.
     * @param data Cadena que modificara a data.
     */
	public void setData(String data) {
		this.data = data;
		LOG.info("El nuevo cambio de data, ahora es: "+data);
	}

	/**
     * Obtener la informacion de su propiedad next.
     * @return El valor de next.
     */
	public Node getNext() {
		LOG.info("Obteniendo next");
		return next;
	}

	/**
     * Modifica la informacion de su propiedad next.
     * @param next Objecto Node que modificara a next.
     */
	public void setNext(Node next) {
		this.next = next;
		LOG.info("El nuevo cambio de next, ahora es: "+next);
	}

	/**
     * Imprime en la consola la secuencia de Nodos que 
     * componen a esta lista. Por ejemplo, para la lista
     * que devuelve el método "build", la invocación de
     * este método escribe en la consola: 
     * 
     * A-->B-->C-->D-->E-->F-->
     * 
     * Lo anterior sería lo que se visualiza en la consola 
     * justo después de ejecutar las siguintes dos lineas:
     * 
     *         Node a = build();
     *         a.prn();
     *         
     */
    void prn() {
        // Este método requiere sólo de 3 a 7 lineas de código para funcionar correctamente
    	String result = "";
    	Node actualNode = this;
    	LOG.info("Observar que haya nuevos nodos");
    	while(actualNode!=null) {
    		result = actualNode.data+"-->"+result;
    		actualNode = actualNode.next;
    	}
    	
    	System.out.println(result);
    }
    
}// ends Node class
