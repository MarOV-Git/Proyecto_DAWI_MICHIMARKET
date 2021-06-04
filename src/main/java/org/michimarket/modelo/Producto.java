package org.michimarket.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_productos")
public class Producto {

	@Id
	@Column (name = "id_prod")
	private String idproducto;
	
	@Column (name = "des_prod")
	private String descripcion;
	
	@Column (name = "preu_prod")
	private double precio;
	
	@Column (name = "sto_prod")
	private int stock;
	
	@Column (name = "id_cat")
	private int idcategoria;
	
	@Column (name = "est_prod")
	private int estado;

	public String getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", descripcion=" + descripcion + ", precio=" + precio + ", stock="
				+ stock + ", idcategoria=" + idcategoria + ", estado=" + estado + "]";
	}
}
