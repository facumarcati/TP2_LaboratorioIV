package Ejercicio3;

public class EdificioDeOficinas implements iEdificio {

	
	private int nroOficinas;
	
	
	
	public EdificioDeOficinas(int nroOficinas) {
			this.setNroOficinas(nroOficinas);
			
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
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
		return "Cantidad de Oficinas [nombre=" + nroOficinas +" ]";
	}


	
	
	
}
