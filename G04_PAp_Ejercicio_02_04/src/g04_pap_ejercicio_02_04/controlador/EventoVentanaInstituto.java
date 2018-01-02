/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g01_g06_pap_ejercicio_02_04.modelo.Instituto;
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
        int cod = Integer.parseInt(this.ventanaInstituto.getTxtList().get(0).getText());
        String nom = this.ventanaInstituto.getTxtList().get(1).getText().toUpperCase();
        String dir = this.ventanaInstituto.getTxtList().get(2).getText().toUpperCase();
        String rec = this.ventanaInstituto.getCombo().getSelectedItem().toString();
        String tel = this.ventanaInstituto.getTxtList().get(3).getText().toUpperCase();
        String ciu = this.ventanaInstituto.getTxtList().get(4).getText().toUpperCase();

        
        Instituto ins = new Instituto(cod,nom,dir,this.ventanaInstituto.getgD().buscarRector(rec),tel,ciu);
        
        this.ventanaInstituto.getgD().persistirInstituto(ins);
    }
    
}
