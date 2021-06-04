package org.michimarket.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_detalleboleta")
public class DetalleBoleta {

	@Id
	@Column(name = "num_bol")
	private String numboleta;
	
	@Column(name = "id_prod")
	private String idproducto;

	@Column(name = "can_bol")
	private int cantidad;
	
	@Column(name = "prepro_bol")
	private double precio;
	
	@Column(name = "imp_bol")
	private double importe;

	public String getNumboleta() {
		return numboleta;
	}

	public void setNumboleta(String numboleta) {
		this.numboleta = numboleta;
	}

	public String getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "DetalleBoleta [numboleta=" + numboleta + ", idproducto=" + idproducto + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", importe=" + importe + "]";
	}
}
