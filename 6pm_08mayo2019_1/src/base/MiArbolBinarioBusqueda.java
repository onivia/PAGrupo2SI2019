package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MiArbolBinarioBusqueda {
	public NodoArbol raiz;

	public MiArbolBinarioBusqueda() {
		this.raiz = null;
	}
	
	public void insertar(NodoArbol NodoArbol) throws Exception {
		NodoArbol NodoArbolAux = null;
		
		if(NodoArbol != null) {
			if(raiz==null) {
				raiz = NodoArbol;
			} else {
				NodoArbolAux = raiz;
				while(true) {
					if(NodoArbol.dato<NodoArbolAux.dato) {
						if(NodoArbolAux.izq!=null) {
							NodoArbolAux = NodoArbolAux.izq;
						} else {
							NodoArbolAux.izq = NodoArbol;
							break;
						}
					} else if (NodoArbol.dato>NodoArbolAux.dato) {
						if(NodoArbolAux.dere!=null) {
							NodoArbolAux = NodoArbolAux.dere;
						} else {
							NodoArbolAux.dere = NodoArbol;
							break;
						}
					} else {
						throw new Exception("NO se permitio insertar NodoArbol, ya existe un NodoArbol con dato: " + NodoArbol.dato);
					}
				}
			}
		}
	}

	public void recorrerAmplitud() throws Exception {
		/* 
		 * 1. Encolar a raiz
		 * 2. En un ciclo siempre y cuando haya algo encolado:
		 * 3.	ubicar a nA con base a lo desencolado
		 * 4.	muestro el dato
		 * 5.	si tiene hijo por izq, encolo a este hijo(izq)
		 * 6.	si tiene hijo por dere, encolo a este hijo(dere) 
		 */
		NodoArbol NodoArbolAux = null;
		//Queue<NodoArbol> cola = null;
		Cola cola = null;
		
		if(raiz!=null) {
			//cola = new LinkedList<NodoArbol>();
			//cola.add(raiz);
			cola = new Cola();
			cola.encolar(raiz);
			while(!cola.estaVacia()) {
				//NodoArbolAux = cola.poll();
				NodoArbolAux = cola.desencolar();
				System.out.println(NodoArbolAux.dato);
				if(NodoArbolAux.izq!=null)
					//cola.add(NodoArbolAux.izq);
					cola.encolar(NodoArbolAux.izq);
				if(NodoArbolAux.dere!=null)
					cola.encolar(NodoArbolAux.dere);
			}
		}
	}
}
