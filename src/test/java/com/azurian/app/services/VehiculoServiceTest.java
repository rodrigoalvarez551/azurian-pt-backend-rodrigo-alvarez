package com.azurian.app.services;

import com.azurian.app.domain.Vehiculo;
import com.azurian.app.repository.VehiculoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class VehiculoServiceTest {

    @InjectMocks
    private VehiculoService vehiculoService;

    @Mock
    private VehiculoRepository vehiculoRepository;

    @Test
    void listarVehiculosOk(){
        List<Vehiculo> vehiculoList = setVehiculoList();
        when(vehiculoRepository.findAll()).thenReturn(vehiculoList);
        assertNotNull(vehiculoService.listarVehiculos());
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
