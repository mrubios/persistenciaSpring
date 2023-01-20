package com.iesch.ad.demo.persistencia.demo.servicios;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import com.iesch.ad.demo.persistencia.demo.modelos.Pelicula;
import com.iesch.ad.demo.persistencia.demo.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Para que lo detecte y que no de el error que daba antes de que te vayas
@Service
public class PeliculaServicios {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;

    public List<Pelicula> buscaTodasLasPeliculas(){
        return peliculaRepositorio.findAll();
    }

    public Pelicula bucaPorId(Long id) {
        Optional<Pelicula> optionalPelicula = peliculaRepositorio.findById(id);
        if (optionalPelicula.isPresent()){
            return optionalPelicula.get();
        }else return null;
    }

    public Pelicula guardaPelicula(Pelicula pelicula) {
        return peliculaRepositorio.save(pelicula);
    }
}
