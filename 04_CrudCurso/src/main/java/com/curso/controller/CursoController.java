package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursosService;


@RestController
public class CursoController {
	@Autowired
	CursosService service;
	
	//http://localhost:8080/curso/{codCurso}
	@GetMapping(value="curso/{codCurso}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarLibro(@PathVariable("codCurso") int codCurso) {
		return service.buscarCurso(codCurso);
	}
	
	//http://localhost:8080/cursos
	@GetMapping(value="cursos")
	public List<Curso> cursos(){
		return service.cursos();
	}
	
	//http://localhost:8080/cursos/{precioMin}/{precioMax}
	@GetMapping(value="cursos/{precioMin}/{precioMax}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursosPrecio(@PathVariable("precioMin") int precioMin,@PathVariable("precioMax") int precioMax) {
		return service.cursosPorPrecio(precioMin,precioMax);
	}
	
	//http://localhost:8080/curso
	@PostMapping(value="curso",consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso) {
		return service.altaCurso(curso);
	}
	//http://localhost:8080/curso
	@PutMapping(value="curso",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCurso(@RequestBody Curso curso) {
		service.actualizarCurso(curso);
	}
	
	//http://localhost:8080/curso/{codCurso}
	@DeleteMapping(value="curso/{codCurso}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable("codCurso") int codCurso){
		return service.eliminarCurso(codCurso);
	}
}
