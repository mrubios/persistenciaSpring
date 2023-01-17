package com.iesch.ad.demo.persistencia.demo.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Actores {
    @Id
    @Column(length = 9)
    String Dni;

    String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    Pelicula pelicula;

}
