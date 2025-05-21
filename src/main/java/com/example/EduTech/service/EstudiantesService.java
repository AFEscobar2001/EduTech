package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.model.Estudiante;
import com.example.EduTech.repository.EstudianteRepository;

@Service
public class EstudiantesService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante registar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

}
