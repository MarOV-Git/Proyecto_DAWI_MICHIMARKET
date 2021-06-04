package org.michimarket.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_boleta")
public class CabeceraBoleta {

	@Id
	@Column (name = "num_bol")
	private String numboleta;
	
	@Column (name = "fec_bol")
	private String fecha;
	
	@Column (name = "cod_usu")
	private String usuario;
	
	@Column (name = "tot_bol")
	private double total;

	public String getNumboleta() {
		return numboleta;
	}

	public void setNumboleta(String numboleta) {
		this.numboleta = numboleta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CabeceraBoleta [numboleta=" + numboleta + ", fecha=" + fecha + ", usuario=" + usuario + ", total="
				+ total + "]";
	}
}
