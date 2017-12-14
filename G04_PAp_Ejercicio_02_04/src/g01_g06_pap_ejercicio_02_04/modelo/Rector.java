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
public class Rector extends Persona implements Serializable {
    private String titulo;

    public Rector(String titulo, int id, String nombre, String apellido, String fechaNac, String cedula) {
        super(id, nombre, apellido, fechaNac, cedula);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Rector{" + "titulo=" + titulo + '}';
    }
    
}
