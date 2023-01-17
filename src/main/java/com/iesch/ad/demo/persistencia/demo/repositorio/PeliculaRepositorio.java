package com.iesch.ad.demo.persistencia.demo.repositorio;

import com.iesch.ad.demo.persistencia.demo.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

}
