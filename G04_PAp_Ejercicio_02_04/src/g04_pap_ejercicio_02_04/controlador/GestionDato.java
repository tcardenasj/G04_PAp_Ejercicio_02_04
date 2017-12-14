/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

/**
 *
 * @author paulo
 */
import g01_g06_pap_ejercicio_02_04.modelo.*;
import java.util.List;
public class GestionDato
{
    private List<Carrera> carreraList;
    private List<Estudiante> estudianteList;
    private List<Inscripcion> inscripList;
    private List<Instituto> instiList;
    
    private List<Rector> rectorList;

    public GestionDato(List<Carrera> carreraList, List<Estudiante> estudianteList, List<Inscripcion> inscripList, List<Instituto> instiList, List<Rector> rectorList) {
        this.carreraList = carreraList;
        this.estudianteList = estudianteList;
        this.inscripList = inscripList;
        this.instiList = instiList;
        this.rectorList = rectorList;
    }

    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public List<Inscripcion> getInscripList() {
        return inscripList;
    }

    public void setInscripList(List<Inscripcion> inscripList) {
        this.inscripList = inscripList;
    }

    public List<Instituto> getInstiList() {
        return instiList;
    }

    public void setInstiList(List<Instituto> instiList) {
        this.instiList = instiList;
    }
    public List<Rector> getRectorList() {
        return rectorList;
    }

    public void setRectorList(List<Rector> rectorList) {
        this.rectorList = rectorList;
    }
    
    
}
