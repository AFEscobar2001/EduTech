package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.model.Cupon;
import com.example.EduTech.repository.CuponRepository;

@Service
public class CuponService {
    @Autowired
    private CuponRepository cuponRepository;

    public String aplicarCupon(Integer id_curso) {
        Cupon cupon = cuponRepository.findById(id_curso).orElse(null);
        if (cupon != null && cupon.isEstado()) {
            return "Cupon aplicado con éxito: " + cupon.getDescuento() + "% de descuento.";
        } else {
            return "El cupon no existe.";
        }
    }

    public Cupon registrar(Cupon cupon) {
        return cuponRepository.save(cupon);
    }

    public List<Cupon> listar() {
        return cuponRepository.findAll();
    }

}

