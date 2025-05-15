package com.example.EduTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EduTech.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
