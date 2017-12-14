/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.vista;

import g01_g06_pap_ejercicio_02_04.modelo.*;
import g04_pap_ejercicio_02_04.controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DavidMorales
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Carrera> carreraList = new ArrayList<Carrera>();
        List<Estudiante> estudianList = new ArrayList<Estudiante>();
        List<Rector> rectorList = new ArrayList<Rector>();
        List<Inscripcion> InscripList = new ArrayList<Inscripcion>();
        List<Instituto> istiList = new ArrayList<Instituto>();
        
        GestionDato gD = new GestionDato(carreraList,estudianList,InscripList,istiList,rectorList);
        VentanaPrincipal vP = new VentanaPrincipal(gD,"INSTITUTO TECNOLOGICO",1200,600);
        vP.setVisible(true);
    }
    
}
