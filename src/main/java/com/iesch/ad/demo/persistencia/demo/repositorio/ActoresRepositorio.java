package com.iesch.ad.demo.persistencia.demo.repositorio;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActoresRepositorio extends JpaRepository<Actores, String> {
}
