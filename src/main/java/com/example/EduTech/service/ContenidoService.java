package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.model.Contenido;
import com.example.EduTech.model.Curso;
import com.example.EduTech.repository.ContenidoRepository;
import com.example.EduTech.repository.CursoRepository;

@Service
public class ContenidoService {
    @Autowired
    private ContenidoRepository contenidoRepository;

    private CursoRepository cursoRepository;

    public Contenido guardar(Contenido contenido, String cursoId) {
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        
        contenido.setCurso(curso);
        return contenidoRepository.save(contenido);
    }

    public List<Contenido> listar() {
        return contenidoRepository.findAll();
    } 

}
