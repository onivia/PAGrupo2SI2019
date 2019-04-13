package principal;

public class Programa {
	public static void main(String[] args) {
		String s1 = new String("100");
		String s2 = s1;
		s2 = "200";
		s1 = new String("300");
//		System.out.println(s1);
//		System.out.println(s2);
		
		Integer i1 = new Integer(100);
		Integer i2 = i1;
		i1 = new Integer(200);
//		System.out.println(i1);
//		System.out.println(i2);
		
		Estudiante e1 = new Estudiante(100, "yo100", "A");
		Estudiante e2 = e1;
		e1.nombre = "el100";
		System.out.println(e1);
		System.out.println(e2);
	}
}
