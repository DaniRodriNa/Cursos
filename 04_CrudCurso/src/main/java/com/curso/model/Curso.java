package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	private int codCurso;
	private String nombre;
	private int duracion;
	private float precio;
	public Curso() {
		
	}
	public Curso(int codCurso, String nombre, int duracion, float precio) {
		super();
		this.codCurso=codCurso;
		this.nombre=nombre;
		this.duracion=duracion;
		this.precio=precio;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	

}
