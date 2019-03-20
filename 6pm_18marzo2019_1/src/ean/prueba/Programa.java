package ean.prueba;

import ean.facturas.FacturaVentaNacional;
import ean.facturas.IFacturaVentaNacional;
import ean.terceros.*;

public class Programa {

	public static void main(String[] args) {
		//cuando necesito usar lo comun
		int opcion = 3;
		
		Tercero tercero = null;		
		tercero = Tercero.crearTercero(opcion);		
		liquidarTercero(tercero);
		
		IFacturaVentaNacional fv = new FacturaVentaNacional();
		obtenerFactura(fv);				
	}
	
	public static void liquidarTercero(Tercero tercero) {
		tercero.liquidar();
		//mas formulas
	}
	
	public static void obtenerFactura(IFacturaVentaNacional fv) {
		fv.obtenerFactura();		
	}
}
