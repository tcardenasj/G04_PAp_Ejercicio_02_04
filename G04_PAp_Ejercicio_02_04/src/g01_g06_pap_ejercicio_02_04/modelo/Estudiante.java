/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01_g06_pap_ejercicio_02_04.modelo;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author DavidMorales
 */
@Entity
public class Estudiante extends Persona implements Serializable {
    private String colegio;

    public Estudiante(String colegio, int id, String nombre, String apellido, String fechaNac, String cedula) {
        super(id, nombre, apellido, fechaNac, cedula);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "colegio=" + colegio + '}';
    }
    
    
    
}
