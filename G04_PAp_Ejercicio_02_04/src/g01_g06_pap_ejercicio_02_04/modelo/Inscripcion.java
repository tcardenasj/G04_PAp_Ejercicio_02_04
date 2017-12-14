/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01_g06_pap_ejercicio_02_04.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DavidMorales
 */
@Entity
public class Inscripcion {
    @Id
    private int id;
    private Estudiante estudiante;
    private Carrera carrera;

    public Inscripcion(int id, Estudiante estudiante, Carrera carrera) {
        this.id = id;
        this.estudiante = estudiante;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id=" + id + ", estudiante=" + estudiante + ", carrera=" + carrera + '}';
    }
    
    
}
