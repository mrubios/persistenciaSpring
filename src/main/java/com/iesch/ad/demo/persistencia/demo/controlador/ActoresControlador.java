package com.iesch.ad.demo.persistencia.demo.controlador;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import com.iesch.ad.demo.persistencia.demo.servicios.ActoresServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActoresControlador {
    @Autowired
    ActoresServicios actoresServicios;

    @GetMapping("api/actores")
    public List<Actores> obtenerTodos(){
        return actoresServicios.buscaTodasLosActores();
    }
}
