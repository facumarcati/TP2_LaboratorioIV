package Ejercicio1;

public class Principal {

	public static void main(String[] args) 
	{
		
		Profesor p1 = new Profesor("Docente", 1, 35, "Pepe");
		Profesor p2 = new Profesor("Docente", 1, 35, "Juan");
		
		if(p1.equals(p2))
			System.out.println("Es el mismo profesor");
		else
			System.out.println("No es el mismo profesor");

	}

}
