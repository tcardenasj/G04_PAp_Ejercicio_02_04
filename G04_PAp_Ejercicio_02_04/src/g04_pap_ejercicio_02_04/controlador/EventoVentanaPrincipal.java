/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

import g04_pap_ejercicio_02_04.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author paulo
 */
public class EventoVentanaPrincipal implements ActionListener
{
     private VentanaPrincipal ventanaPrincipal;

    public EventoVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
     
     

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(0))){
            VentanaRector vR = new VentanaRector(this.ventanaPrincipal.getgD());
            vR.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vR);
        }
          if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(1))){
            VentanaEstudiante vE = new VentanaEstudiante(this.ventanaPrincipal.getgD());
            vE.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vE);
        }
          if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(2))){
            VentanaInstituto vI = new VentanaInstituto(this.ventanaPrincipal.getgD());
            vI.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vI);
        }
           if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(3))){
            VentanaCarrera vC = new VentanaCarrera(this.ventanaPrincipal.getgD());
            vC.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vC);
        }
             if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(4))){
            VentanaInscripcion vi = new VentanaInscripcion(this.ventanaPrincipal.getgD());
            vi.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vi);
        }
    }
    
}
