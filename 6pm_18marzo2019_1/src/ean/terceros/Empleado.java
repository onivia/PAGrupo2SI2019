package ean.terceros;

public class Empleado extends Tercero {

	public Empleado() {
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar Empelado");
	}
}
