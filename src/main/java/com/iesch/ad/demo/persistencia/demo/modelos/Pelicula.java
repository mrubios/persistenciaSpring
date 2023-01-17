package com.iesch.ad.demo.persistencia.demo.modelos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Ni puta idea pero quita el stack overflow al hacer un get
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String titulo;
    LocalDate anyo;
    String genero;
    String urlFoto;
    String director;
    String sinopsis;
    int duracion;
    int puntuacion;

    @OneToMany(mappedBy = "pelicula", fetch = FetchType.EAGER)
    List<Actores> actores;

}
