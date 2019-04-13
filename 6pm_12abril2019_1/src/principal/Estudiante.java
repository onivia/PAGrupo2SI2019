package principal;

public class Estudiante {
	public int codigo;
	public String nombre;
	public String direccion;
	
	public Estudiante(int codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	

	@Override
	public int hashCode() {
		int resultado = 0;
		int primo = 31;
		
		resultado = primo + String.valueOf(this.codigo).hashCode();
		resultado = (primo * resultado) + this.nombre.hashCode();
		resultado = (primo * resultado) + this.direccion.hashCode();
		
		//System.out.println("paso x aki!");
		
		return resultado;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Estudiante otroEstudiante = null;
		
		if(obj!=null && (obj instanceof Estudiante)) {
			otroEstudiante = (Estudiante)obj;
			
			/*
			if(this.codigo==otroEstudiante.codigo
			    && this.nombre.equals(otroEstudiante.nombre)
			    && this.direccion.equals(otroEstudiante.direccion)) {
				
				sonIguales = true;
			}
			*/
			if(this.hashCode()==otroEstudiante.hashCode())
				sonIguales = true;
		}
		
		return sonIguales;
	}

	@Override
	public String toString() {
		return ("codigo: " + this.codigo + " nombre:" + this.nombre + " direccion: " + this.direccion);
	}
	
	
}
