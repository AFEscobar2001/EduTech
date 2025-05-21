package com.example.EduTech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.repository.InscripcionRepository;

@Service
public class InscripcionService {
    @Autowired 
    private InscripcionRepository inscripcionRepository;

}
