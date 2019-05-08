package prueba;

import base.MiArbolBinarioBusqueda;
import base.NodoArbol;

public class Programa {

	public static void main(String[] args) throws Exception {
		prueba_ArbolBinBusqueda();
	}
	
	public static void prueba_ArbolBinBusqueda() throws Exception {
		MiArbolBinarioBusqueda arbol = new MiArbolBinarioBusqueda();
		
		arbol.insertar(new NodoArbol(40));
		arbol.insertar(new NodoArbol(15));
		arbol.insertar(new NodoArbol(95));
		arbol.insertar(new NodoArbol(20));
		arbol.insertar(new NodoArbol(80));
		arbol.recorrerAmplitud();
	}
}
