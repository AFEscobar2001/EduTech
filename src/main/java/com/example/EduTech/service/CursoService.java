package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.dto.CursoDTO;
import com.example.EduTech.model.Curso;
import com.example.EduTech.model.Estudiante;
import com.example.EduTech.repository.CursoRepository;
import com.example.EduTech.repository.EstudianteRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    public String guardarCurso(CursoDTO cursoDTO) {
        if(!estudianteRepository.existsById(cursoDTO.getRut())) {
            return "El usuario no existe";
        }

        Estudiante estudiante = estudianteRepository.findById(cursoDTO.getRut()).get();

        Curso curso = new Curso();
        curso.setCodigo(cursoDTO.getCodigo());
        curso.setNombre(cursoDTO.getNombre());  
        curso.setDescripcion(cursoDTO.getDescripcion());
        curso.setEstudiante(estudiante);

        cursoRepository.save(curso);
        return "Curso guardado correctamente";
    }

    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

}
