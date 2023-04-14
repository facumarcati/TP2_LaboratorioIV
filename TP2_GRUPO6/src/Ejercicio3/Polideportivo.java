package Ejercicio3;

public class Polideportivo implements iInstalacionDeportiva, iEdificio {

	private String nombre;
	private double superficieEdificio;
	private int tipoDeInstalacion;
	
	public Polideportivo(String nombre, double superficieEdificio, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficieEdificio = superficieEdificio;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return superficieEdificio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String mostrarInformacion() {
		// TODO Auto-generated method stub
		return "Polideportivo [nombre=" + nombre + ", superficieEdificio="+ this.getTipoDeInstalacion()+", tipoDeInstalacion ="+ this.getTipoDeInstalacion() +" ]";
	}

}
