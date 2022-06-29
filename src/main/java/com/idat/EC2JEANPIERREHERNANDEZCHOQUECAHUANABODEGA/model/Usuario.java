package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idUsuario;
	private String usuario;
	private String password;
	private Integer rol;
	
	
	
	
	
	
	
	
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
}
