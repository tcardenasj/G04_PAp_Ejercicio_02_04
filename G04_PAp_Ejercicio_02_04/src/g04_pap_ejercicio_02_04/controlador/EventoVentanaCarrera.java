/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g04_pap_ejercicio_02_04.vista.VentanaCarrera;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class EventoVentanaCarrera implements ActionListener{

   private VentanaCarrera ventanaCarrera; 

    public EventoVentanaCarrera(VentanaCarrera ventanaCarrera) {
        this.ventanaCarrera = ventanaCarrera;
    }

    public VentanaCarrera getVentanaCarrera() {
        return ventanaCarrera;
    }

    public void setVentanaCarrera(VentanaCarrera ventanaCarrera) {
        this.ventanaCarrera = ventanaCarrera;
    }
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
