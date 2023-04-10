package Ejercicio1;

public class Empleado implements Comparable<Empleado>{

	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont = 1000;
	
	public Empleado() {
		this.id = cont;
		this.nombre = "Sin nombre";
		this.edad = 99;
		
		cont++;
	}
	
	public Empleado(String nombre, int edad) {
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
		
		cont++;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + " ";
	}
	
	public static int devuelveProximoID() {
		return cont;
	}
	
	@Override
	public int compareTo(Empleado o) {
		if(o.getId() == this.id) {
			return 0;
		}
		if(o.getId() < this.id) {
			return 1;
		}
		return -1;
	}
}
