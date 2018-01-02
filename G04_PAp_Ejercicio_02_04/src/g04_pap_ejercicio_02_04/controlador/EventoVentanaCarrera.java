/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g01_g06_pap_ejercicio_02_04.modelo.Carrera;
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
        int cod = Integer.parseInt(this.ventanaCarrera.getTxtList().get(0).getText());
        String nom = this.ventanaCarrera.getTxtList().get(1).getText().toUpperCase();
        String ins = this.ventanaCarrera.getCombo().getSelectedItem().toString();
        int cap = Integer.parseInt(this.ventanaCarrera.getTxtList().get(3).getText().toUpperCase());
        
        Carrera ca = new Carrera(cod,nom,this.ventanaCarrera.getgD().buscarInstituto(ins),cap);
        
        
        this.ventanaCarrera.getgD().persistirCarrera(ca);
    }
    
}
