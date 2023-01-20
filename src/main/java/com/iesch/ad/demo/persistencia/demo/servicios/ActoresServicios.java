package com.iesch.ad.demo.persistencia.demo.servicios;

import com.iesch.ad.demo.persistencia.demo.modelos.Actores;
import com.iesch.ad.demo.persistencia.demo.repositorio.ActoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActoresServicios {

    @Autowired
    ActoresRepositorio actoresRepositorio;

    public List<Actores> buscaTodasLosActores(){
        return actoresRepositorio.findAll();
    }
    public Actores bucaPorId(String dni){
        Optional<Actores> optionalActores = actoresRepositorio.findById(dni);
        if (optionalActores.isPresent()){
            return optionalActores.get();
        }
        else {return null;}
    }

    public Actores guardaActor(Actores actores) {
        return actoresRepositorio.save(actores);
    }
}
