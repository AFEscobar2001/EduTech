package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.model.Profesor;
import com.example.EduTech.repository.ProfesorRepository;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor registrar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }
}
