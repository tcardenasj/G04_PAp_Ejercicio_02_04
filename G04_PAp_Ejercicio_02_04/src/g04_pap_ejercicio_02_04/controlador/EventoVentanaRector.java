/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g01_g06_pap_ejercicio_02_04.modelo.Rector;
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
        String nom = this.ventanaRector.getTxtList().get(0).getText().toUpperCase();
        String ap = this.ventanaRector.getTxtList().get(1).getText().toUpperCase();
        String feNac = this.ventanaRector.getTxtList().get(2).getText().toUpperCase();
        String ci = this.ventanaRector.getTxtList().get(3).getText().toUpperCase();
        int cod = Integer.parseInt(this.ventanaRector.getTxtList().get(4).getText());
        String tit = this.ventanaRector.getTxtList().get(5).getText().toUpperCase();
        
        Rector rec = new Rector(cod,nom,ap,feNac,ci,tit);
        
        
        this.ventanaRector.getgD().persistirRector(rec);
    }
    
}
