package ean.terceros;

import ean.facturas.FacturaVentaNacional;
import ean.facturas.IFacturaVentaNacional;

public class Proveedor extends Tercero implements IFacturaVentaNacional {
	public Proveedor() {
	}
	
	public void obtenerOrdenesCompra() {
		System.out.println("paso por obtenerOrdenesCompra");
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar Proveedor");		
	}

	@Override
	public void obtenerFactura() {
		FacturaVentaNacional fvn = null;
		fvn = new FacturaVentaNacional();
		fvn.obtenerFactura();		
	}
}
