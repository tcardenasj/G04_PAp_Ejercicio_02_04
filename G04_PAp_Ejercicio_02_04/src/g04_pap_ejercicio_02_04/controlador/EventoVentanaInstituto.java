/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g04_pap_ejercicio_02_04.vista.VentanaInstituto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class EventoVentanaInstituto implements ActionListener {

    private VentanaInstituto ventanaInstituto;

    public EventoVentanaInstituto(VentanaInstituto ventanaInstituto) {
        this.ventanaInstituto = ventanaInstituto;
    }

    public VentanaInstituto getVentanaInstituto() {
        return ventanaInstituto;
    }

    public void setVentanaInstituto(VentanaInstituto ventanaInstituto) {
        this.ventanaInstituto = ventanaInstituto;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
