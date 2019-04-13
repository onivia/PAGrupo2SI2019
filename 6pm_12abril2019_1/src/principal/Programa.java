package principal;

public class Programa {
	public static void main(String[] args) {			
		Estudiante e1 = new Estudiante(100, "yo100", "A");
		m1(e1);
		System.out.println("despues de llamar a m1 - " + e1);
	}
	
	public static void m1(final Estudiante e) {
		System.out.println("entro a m1 (1) - " + e);
//		e.codigo = 600;
//		System.out.println("entro a m1 (2) - " + e);
		//e = new Estudiante(200, "yo200", "B");
		e.codigo = 500;		
		System.out.println("entro a m1 (3) - " + e);
	}
}
