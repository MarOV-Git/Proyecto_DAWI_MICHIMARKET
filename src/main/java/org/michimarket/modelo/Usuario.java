package org.michimarket.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_usuarios")
public class Usuario {

	@Id
	@Column (name = "cod_usu")
	private String codigo;
	
	@Column (name = "nom_usu")
	private String nombre;
	
	@Column (name = "ape_usu")
	private String apellido;
	
	@Column (name = "cod_dis")
	private int iddistrito;
	
	@Column (name = "user_usu")
	private String usuario;
	
	@Column (name = "cla_usu")
	private String clave;
	
	@Column (name = "fnac_usu")
	private String fechanaci;
	
	@Column (name = "id_tipo")
	private int idtipo;
	
	@Column (name = "est_usu")
	private int estado;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIddistrito() {
		return iddistrito;
	}

	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getFechanaci() {
		return fechanaci;
	}

	public void setFechanaci(String fechanaci) {
		this.fechanaci = fechanaci;
	}

	public int getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", iddistrito="
				+ iddistrito + ", usuario=" + usuario + ", clave=" + clave + ", fechanaci=" + fechanaci + ", idtipo="
				+ idtipo + ", estado=" + estado + "]";
	}
}
