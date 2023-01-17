package com.iesch.ad.demo.persistencia.demo.controlador;

import com.iesch.ad.demo.persistencia.demo.modelos.Pelicula;
import com.iesch.ad.demo.persistencia.demo.servicios.PeliculaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeliculasControlador {

    @Autowired
    PeliculaServicios peliculaServicios;

    @GetMapping("api/peliculas")
    public List<Pelicula> obtenerTodas(){
        return peliculaServicios.buscaTodasLasPeliculas();
    }

}