package base;

public class Cola extends MiLista {
	public Cola() {
		super();
	}
	
	public void encolar(int dato) throws Exception {
		Nodo nodo = null;
		
		nodo = new Nodo(dato);
		super.adicionar(nodo);
	}
	
	public int desencolar() {
		Nodo nodo = null;
		
		nodo = super.obteneryRemoverPrimero();
				
		return ((nodo!=null) ? nodo.dato : -1);
	}
	
	public void mostrarCola() {
		super.mostrarLista();		
	}
}
