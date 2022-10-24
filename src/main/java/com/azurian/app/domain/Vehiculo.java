package com.azurian.app.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "auto")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long        id;
    private String      modelo;
    private Integer     fabricacion;
    @ManyToOne
    @JoinColumn(name = "fabricante_id")
    private Fabricante  fabricante;
}
