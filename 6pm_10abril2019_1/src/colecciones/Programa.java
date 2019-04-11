package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		pruebaArrayList();
	}
	
	public static void pruebaArrayList() {
		List<Estudiante> arraylist = new ArrayList<Estudiante>();
		Estudiante e = null;
		
		e = new Estudiante(100, "yo100", "A");
		arraylist.add(e);
		e = new Estudiante(200, "yo200", "B");
		arraylist.add(e);
		arraylist.add(e);
		
		//System.out.println(arraylist.get(3));
		
		//arraylist.remove(new Estudiante(200, "yo200", "B"));
		System.out.println(arraylist.contains(new Estudiante(200, "yo200", "B")));
		
		/*
		for(Estudiante en : arraylist) {
			System.out.println(en);
		}
		*/		
	}
}
