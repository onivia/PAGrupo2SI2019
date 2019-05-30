package principal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Programa {
	public static void main(String[] args) {
		List<Estudiante> ests = Arrays.asList((new Estudiante(100, "100")),(new Estudiante(20, "20")),(new Estudiante(300, "300")));
		List<Estudiante> ests2 = ests;		
		
		//ests.forEach(o -> System.out.println(o));
		ests.stream().filter(o -> o.codigo.equals(20)).forEach(o -> o.nombre="veinte");
		ests.forEach(o -> System.out.println(o));
		ests = ests.stream()
			    .map(person -> ests2.stream()                                       // map Person to
			                              .filter(i -> i.codigo.equals(20))  // .. the found Id
			                              .findFirst().orElse(person))                    // .. or else to self
			    .collect(Collectors.toList()); 
		ests.forEach(o -> System.out.println(o));					
	}
	
	public static void ejemplo_Lambdas() {
		//(parametros)->(expresion) o las instrucciones(return)
		Imprimible obj = o -> { System.out.println(o); };		
		obj.imprimir("perdidos?");
		
		procesar(obj,"hola todos");
	}
	
	public static void procesar(Imprimible obj, String msj) {
		obj.imprimir(msj);
	}
	
	public static void lambda(String o) {
		System.out.println(o);		
	}
	
	public static void ejemplo_Optional() {
		Optional<String> cadena = null;
		Integer suma = null;
		
		List<Integer> nums = Arrays.asList(100,34,50,10);
		Optional<Integer> num = obtenerNumero(nums,2); 
		
		System.out.println(num.orElse(0) + 10);
		
		/*
		if(num!=null) {
			suma = num + 10;
			System.out.println(suma);
		} else {
			System.out.println(10);
		}
		*/		
	}
	
	public static Optional<Integer> obtenerNumero(List<Integer> nums, int posi) {
		int i = 0;
		Optional<Integer> resultado = Optional.empty();
		
		for(Integer num : nums) {
			if(i==posi)
				resultado = Optional.of(num);
			i++;
		}
		
		return resultado;
	}
	
	public static String obtieneCadena(int opcion) {
		switch (opcion) {
		case 1:
			return "hola";
		default:
			return null;
		} 
	}
}
