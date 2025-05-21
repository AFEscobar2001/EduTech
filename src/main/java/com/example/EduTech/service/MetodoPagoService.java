package com.example.EduTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EduTech.dto.MetodoPagoDTO;
import com.example.EduTech.model.MetodoPago;
import com.example.EduTech.repository.MetodoPagoRepository;

@Service
public class MetodoPagoService {
    @Autowired
    private MetodoPagoRepository metodoPagoRepository;
    
    public MetodoPago guardar(MetodoPagoDTO metodoPagoDTO) {
        MetodoPago metodo = new MetodoPago();
        metodo.setTipo(metodoPagoDTO.getTipo());
        metodo.setBanco(metodoPagoDTO.getEntidad());
        metodo.setNombreTitular(metodoPagoDTO.getUltimosDigitos());

        return metodoPagoRepository.save(metodo);
    }

    public List<MetodoPago> listar() {
        return metodoPagoRepository.findAll();
    }
}
