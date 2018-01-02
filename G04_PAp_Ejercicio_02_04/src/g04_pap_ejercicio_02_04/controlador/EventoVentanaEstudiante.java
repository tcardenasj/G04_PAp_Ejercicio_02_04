/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g01_g06_pap_ejercicio_02_04.modelo.Estudiante;
import g04_pap_ejercicio_02_04.vista.VentanaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class EventoVentanaEstudiante implements ActionListener {

    private VentanaEstudiante ventanaEstudiante;

    public EventoVentanaEstudiante(VentanaEstudiante ventanaEstudiante) {
        this.ventanaEstudiante = ventanaEstudiante;
    }

    public VentanaEstudiante getVentanaEstudiante() {
        return ventanaEstudiante;
    }

    public void setVentanaEstudiante(VentanaEstudiante ventanaEstudiante) {
        this.ventanaEstudiante = ventanaEstudiante;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nom = this.ventanaEstudiante.getTxtList().get(0).getText().toUpperCase();
        String ap = this.ventanaEstudiante.getTxtList().get(1).getText().toUpperCase();
        String feNac = this.ventanaEstudiante.getTxtList().get(2).getText().toUpperCase();
        String ci = this.ventanaEstudiante.getTxtList().get(3).getText().toUpperCase();
        int cod = Integer.parseInt(this.ventanaEstudiante.getTxtList().get(4).getText());
        String col = this.ventanaEstudiante.getTxtList().get(5).getText().toUpperCase();
        
        Estudiante es = new Estudiante(cod,nom,ap,feNac,ci,col);
        
        
        this.ventanaEstudiante.getgD().persistirEstudiante(es);
    }
    
}
