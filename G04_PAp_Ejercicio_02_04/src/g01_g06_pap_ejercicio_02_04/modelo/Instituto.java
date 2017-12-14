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
public class Instituto implements Serializable {
    @Id
    private int id;
    private String nombre;
    private String direccion;
    private Rector rector;
    private String telefono;
    private String ciudad;

    public Instituto(int id, String nombre, String direccion, Rector rector, String telefono, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.rector = rector;
        this.telefono = telefono;
        this.ciudad = ciudad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Instituto{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", rector=" + rector + ", telefono=" + telefono + ", ciudad=" + ciudad + '}';
    }
    
    
}
