package ean.terceros;

public class Cliente extends Tercero {
	public Cliente() {
	}
	
	public void obtenerIva() {
		System.out.println("paso por obtenerIva");		
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar Cliente");		
	}
	
	public void m1() {
		
	}
}
