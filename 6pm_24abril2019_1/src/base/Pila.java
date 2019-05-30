package base;

public class Pila extends MiLista {

	public Pila() {
		super();
	}
	
	public void apilar(int dato) throws Exception {
		Nodo nodo = null;
		
		nodo = new Nodo(dato);
		super.insertarPrimero(nodo);
	}
	
	public int desapilar() {
		Nodo nodo = null;
		
		nodo = super.obteneryRemoverPrimero();
				
		return ((nodo!=null) ? nodo.dato : -1);
	}
	
	public void mostarPila() {
		super.mostrarLista();		
	}
}
