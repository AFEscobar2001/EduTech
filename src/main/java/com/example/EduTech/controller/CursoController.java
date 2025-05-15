package com.example.EduTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EduTech.dto.CursoDTO;
import com.example.EduTech.model.Curso;
import com.example.EduTech.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping
    public String guardarCurso(@RequestBody CursoDTO cursoDTO) {
        return cursoService.guardarCurso(cursoDTO);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listar();
    }

}
