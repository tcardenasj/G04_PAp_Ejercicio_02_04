/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g04_pap_ejercicio_02_04.vista.VentanaInscripcion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class EventoVentanaInscripcion implements ActionListener {

    private VentanaInscripcion ventanaInscripcion;

    public EventoVentanaInscripcion(VentanaInscripcion ventanaInscripcion) {
        this.ventanaInscripcion = ventanaInscripcion;
    }

    public VentanaInscripcion getVentanaInscripcion() {
        return ventanaInscripcion;
    }

    public void setVentanaInscripcion(VentanaInscripcion ventanaInscripcion) {
        this.ventanaInscripcion = ventanaInscripcion;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
