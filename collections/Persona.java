package fes.aragon.inicios;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private Integer edad;
		
	public Persona() {
		super();
	}
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public int compareTo(Persona o) {
		if(this.edad> o.getEdad()) {
			return -1;
		}else {
			return 1;	
		}
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	

}
