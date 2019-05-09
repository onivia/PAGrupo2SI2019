package base;

public class Cola extends MiLista {
	public Cola() {
		super();
	}
	
	public void encolar(NodoArbol nodoArbol) throws Exception {
		Nodo nodo = null;
		
		nodo = new Nodo(nodoArbol);
		super.adicionar(nodo);
	}
	
	public NodoArbol desencolar() {
		Nodo nodo = null;
		
		nodo = super.obteneryRemoverPrimero();
				
		return ((nodo!=null) ? nodo.nodoDato : null);
	}
	
	public boolean estaVacia() {
		return (super.estaVacia());	
	}
	
	public void mostrarCola() {
		super.mostrarLista();		
	}
}
