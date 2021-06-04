package org.michimarket.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_distritos")
public class Distrito {

	@Id
	@Column (name = "cod_dis")
	private int codigo;
	
	@Column (name = "nom_dis")
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Distrito [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}
