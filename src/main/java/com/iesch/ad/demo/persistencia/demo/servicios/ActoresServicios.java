package com.iesch.ad.demo.persistencia.demo.servicios;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import com.iesch.ad.demo.persistencia.demo.repositorio.ActoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActoresServicios {

    @Autowired
    ActoresRepositorio actoresRepositorio;

    public List<Actores> buscaTodasLosActores(){
        return actoresRepositorio.findAll();
    }
}
