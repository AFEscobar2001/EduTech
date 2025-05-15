package com.example.EduTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EduTech.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {

}
