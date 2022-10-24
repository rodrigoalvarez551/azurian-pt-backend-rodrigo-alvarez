package com.azurian.app.services;

import com.azurian.app.domain.Vehiculo;
import com.azurian.app.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }
}
