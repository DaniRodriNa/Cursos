package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer> {
	@Query(value="select * from cursos.curso  where precio > ?1 and precio < ?2 ",nativeQuery = true)
	public List<Curso> buscarCursosPorPrecio(float precioMin,float precioMax);
}
