package cliente;

import operaciones.aritmeticas.OperacionAritmetica;

public class Programa {

	public static void main(String[] args) {
		int num1 = 50, num2 = 20;
		int r = OperacionAritmetica.suma(num1, num2);
		
		System.out.println(r);
	}
}
