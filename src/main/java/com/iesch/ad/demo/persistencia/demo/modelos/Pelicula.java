package com.iesch.ad.demo.persistencia.demo.modelos;

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
