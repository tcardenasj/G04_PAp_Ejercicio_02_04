/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g01_g06_pap_ejercicio_02_04.modelo.Inscripcion;
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
        int cod = Integer.parseInt(this.ventanaInscripcion.getTxtList().get(0).getText());
        String est = this.ventanaInscripcion.getCombo().getSelectedItem().toString();
        String car = this.ventanaInscripcion.getCombo2().getSelectedItem().toString();
        
        
        Inscripcion ins = new Inscripcion(cod,this.getVentanaInscripcion().getgD().buscarEstudiante(est),this.ventanaInscripcion.getgD().buscarCarrera(car));
        
        this.ventanaInscripcion.getgD().persistirInscripcion(ins);
    }
    
    
}
