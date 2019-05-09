package base;

public class Nodo {
	//public int dato;
	public NodoArbol nodoDato;
	public Nodo sgte;
	
	public Nodo() {
		this.nodoDato = null;
		this.sgte = null;
	}
	
	public Nodo(NodoArbol nodoDato) {
		this.nodoDato = nodoDato;
		this.sgte = null;
	}

	@Override
	public String toString() {
		return ("dato: " + this.nodoDato.dato);
	}
}
