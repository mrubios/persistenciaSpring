package com.iesch.ad.demo.persistencia.demo.servicios;

import com.iesch.ad.demo.persistencia.demo.modelos.Pelicula;
import com.iesch.ad.demo.persistencia.demo.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Para que lo detecte y que no de el error que daba antes de que te vayas
@Service
public class PeliculaServicios {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;

    public List<Pelicula> buscaTodasLasPeliculas(){
        return peliculaRepositorio.findAll();
    }

}
