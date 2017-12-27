/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
