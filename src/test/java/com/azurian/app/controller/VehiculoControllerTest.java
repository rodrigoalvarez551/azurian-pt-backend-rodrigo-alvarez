package com.azurian.app.controller;

import com.azurian.app.domain.Vehiculo;
import com.azurian.app.services.VehiculoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class VehiculoControllerTest {

    @InjectMocks
    private VehiculoController vehiculoController;

    @Mock
    private VehiculoService vehiculoService;

    @Test
    void vehiculoListTest(){
        List<Vehiculo> vehiculoList = setVehiculoList();
        when(vehiculoService.listarVehiculos()).thenReturn(vehiculoList);
        assertNotEquals(0,vehiculoController.vehiculoList().size());

    }

    private List<Vehiculo> setVehiculoList(){
        List<Vehiculo> vehiculoList = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setFabricacion(2000 + i);
            vehiculo.setId((long) i);
            vehiculo.setModelo("Auto "+i);
            vehiculoList.add(vehiculo);
        }
        return vehiculoList;
    }

}
