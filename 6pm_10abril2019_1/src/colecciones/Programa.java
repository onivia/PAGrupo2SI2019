package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		//pruebaArrayList();
		//pruebaHashSet();
		pruebaHashMap();
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
	
	public static void pruebaHashSet() {
		Set<Estudiante> set = new HashSet<Estudiante>();
		boolean adiciono = false;
		
		adiciono = set.add(new Estudiante(100, "yo100", "A"));
		adiciono = set.add(new Estudiante(200, "yo200", "B"));
		adiciono = set.add(new Estudiante(100, "yo100", "A"));
//		System.out.println(adiciono);
		System.out.println(set.remove(new Estudiante(200, "yo200", "B")));
		System.out.println(set.size());
//		for(Estudiante e : set) {
//			System.out.println(e);
//		}
	}
	
	public static void pruebaHashMap() {
		Map<Integer,Estudiante> map = new HashMap<Integer,Estudiante>();
		map.put(100, new Estudiante(100,"yo100","A"));
		map.put(200, new Estudiante(200,"yo200","B"));
		map.put(300, new Estudiante(100,"yo100","Z"));
		
		System.out.println(map.size());
		System.out.println(map.get(300));
	}
}
