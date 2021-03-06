package ean.terceros;

public abstract class Tercero {
	public abstract void liquidar();
	
	public void validarSarglaft() {
		System.out.println("paso por validarSarglaft");
	}
	
	public static Tercero crearTercero(int opcion) {
		switch (opcion) {
		case 1: //Cliente
			return (new Cliente());
		case 2: //Proveedor
			return (new Proveedor());
		case 3: //Empleado
			return (new Empleado());
		default:
			return null;
		}
	}
}
