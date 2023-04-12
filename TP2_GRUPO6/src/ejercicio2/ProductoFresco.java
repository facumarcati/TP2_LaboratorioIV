package ejercicio2;

import java.util.Date;

public class ProductoFresco extends Producto{
	
	private Date fechaEnvasado;
	private String paisOrigen;
	
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
	
	
}
