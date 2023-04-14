package Ejercicio3;

public class EdificioDeOficinas implements iEdificio {

	
	private int nroOficinas;
	private double superficieEdificio;	
	
	public EdificioDeOficinas(int nroOficinas, double superficieEdificio) {		
			this.setNroOficinas(nroOficinas);
			this.superficieEdificio = superficieEdificio;		
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return superficieEdificio;
	}

	public int getNroOficinas() {
		return nroOficinas;
	}

	public void setNroOficinas(int nroOficinas) {
		this.nroOficinas = nroOficinas;
	}
	
		
	@Override
	public String mostrarInformacion() {
		// TODO Auto-generated method stub
		return "Cantidad de Oficinas [numeroOficinas=" + nroOficinas +", superficieEdificio=" + this.getSuperficieEdificio()+" ]";
	}

	
}
