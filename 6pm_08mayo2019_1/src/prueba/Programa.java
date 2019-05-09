package prueba;

import base.Cola;
import base.MiArbolBinarioBusqueda;
import base.Nodo;
import base.NodoArbol;

public class Programa {

	public static void main(String[] args) throws Exception {
		prueba_ArbolBinBusqueda();
		//prueba_Cola();
	}
	
	public static void prueba_Cola() throws Exception {
		Cola cola = new Cola();
		NodoArbol nodo = null;
		
		cola.encolar(new NodoArbol(100));
		cola.encolar(new NodoArbol(200));
		cola.encolar(new NodoArbol(300));
		nodo = cola.desencolar();
		System.out.println("desencolado:" + nodo.dato);
		//cola.mostrarCola();
		cola.desencolar();
		cola.desencolar();
		cola.mostrarCola();
		System.out.println("estaVacia:" + cola.estaVacia());
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
