package com.azurian.app.controller;

import com.azurian.app.domain.Vehiculo;
import com.azurian.app.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    VehiculoService vehiculoService;

    @CrossOrigin
    @GetMapping("/list")
    List<Vehiculo> vehiculoList(){
        return vehiculoService.listarVehiculos();
    }
}
