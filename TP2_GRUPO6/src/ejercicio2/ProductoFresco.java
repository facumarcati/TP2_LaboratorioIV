package ejercicio2;

import java.util.Date;

public class ProductoFresco extends Producto implements iMostrar{
	
	private Date fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco(Date fechaEnvasado, String paisOrigen, Date fechaCaducidad, int nroLote) {
		super(fechaCaducidad, nroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String mostrarInformacion() {
		return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
				+ ", FechaCaducidad()=" + getFechaCaducidad() + ", NroLote()=" + getNroLote() + "]";
	}
	
	
}
