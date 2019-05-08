package base;

public class NodoArbol {
	public int dato;
	public NodoArbol izq;
	public NodoArbol dere;

	public NodoArbol(int dato) {
		this.dato = dato;
		this.izq = null;
		this.dere = null;
	}
}
