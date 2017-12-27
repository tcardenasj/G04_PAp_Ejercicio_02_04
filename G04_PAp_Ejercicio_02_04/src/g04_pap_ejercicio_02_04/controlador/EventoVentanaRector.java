/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g04_pap_ejercicio_02_04.vista.VentanaRector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class EventoVentanaRector implements ActionListener{

    private VentanaRector ventanaRector;

    public EventoVentanaRector(VentanaRector ventanaRector) {
        this.ventanaRector = ventanaRector;
    }

    public VentanaRector getVentanaRector() {
        return ventanaRector;
    }

    public void setVentanaRector(VentanaRector ventanaRector) {
        this.ventanaRector = ventanaRector;
    }
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
