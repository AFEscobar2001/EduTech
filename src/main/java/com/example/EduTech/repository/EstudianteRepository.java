package com.example.EduTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EduTech.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, String> {
    

}
