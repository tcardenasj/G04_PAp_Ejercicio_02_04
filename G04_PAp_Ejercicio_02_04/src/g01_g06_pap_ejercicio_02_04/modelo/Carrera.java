/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01_g06_pap_ejercicio_02_04.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DavidMorales
 */
@Entity
public class Carrera implements Serializable {
    @Id
    private int id;
    private String nombre;
    private Instituto instituto;
    private int capacidad;

    public Carrera(int id, String nombre, Instituto instituto, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.instituto = instituto;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", instituto=" + instituto + ", capacidad=" + capacidad + '}';
    }
    
    
}
