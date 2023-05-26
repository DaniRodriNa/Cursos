package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {
	List<Curso> cursos();
	List<Curso> cursosPorPrecio(float precioMin,float precioMax);
	Curso buscarCurso(int isbn);
	List<Curso> altaCurso(Curso curso);
	void actualizarCurso(Curso curso);
	List<Curso> eliminarCurso(int isbn);
}
