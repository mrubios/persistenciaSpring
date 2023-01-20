package com.iesch.ad.demo.persistencia.demo.controlador;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import com.iesch.ad.demo.persistencia.demo.servicios.ActoresServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActoresControlador {
    @Autowired
    ActoresServicios actoresServicios;

    @GetMapping("api/actores")
    public List<Actores> obtenerTodos(){
        return actoresServicios.buscaTodasLosActores();
    }

    @GetMapping("api/actor/{dni}")
    public Actores buscaPorDni(@PathVariable String dni){
        return actoresServicios.bucaPorId(dni);
    }

    @PostMapping("api/actor")
    public Actores insertarActor(@RequestBody Actores actores){
        Actores actorSalvado = actoresServicios.guardaActor(actores);
        return actorSalvado;
    }
}
