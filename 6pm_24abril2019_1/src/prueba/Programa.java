package prueba;

import base.Cola;
import base.Pila;

public class Programa {
	public static void main(String[] args) throws Exception {
		//prueba_Cola();
		prueba_Pila();
	}
	
	public static void prueba_Cola() throws Exception {
		Cola cola = new Cola();
		
		cola.encolar(8);
		cola.encolar(10);
		cola.encolar(5);
		cola.encolar(6);
		int num = cola.desencolar();
		System.out.println("desencolado: " + num);
		num = cola.desencolar();
		System.out.println("desencolado: " + num);
		
		cola.mostrarCola();
	}
	
	public static void prueba_Pila() throws Exception {
		Pila pila = new Pila();
		pila.apilar(8);
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(4);
		int num = pila.desapilar();
		System.out.println("desapilado: " + num);		
		pila.mostarPila();
	}
}
