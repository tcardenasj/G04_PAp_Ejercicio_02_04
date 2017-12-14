/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.vista;

import g04_pap_ejercicio_02_04.controlador.EventoVentanaPrincipal;
import g04_pap_ejercicio_02_04.controlador.GestionDato;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author paulo
 */
public class VentanaPrincipal extends JFrame
{
    private JDesktopPane escritorio;
    private JMenuBar barramenu;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private VentanaEstudiante ventanaEstudiante;
    private VentanaRector ventanaRector;
    private VentanaInscripcion ventanaInscripcion;
    private VentanaCarrera ventanaCarrera;
    private VentanaInstituto ventanaInstito;
    private GestionDato gD;

    public VentanaPrincipal(GestionDato gD, String title, int ancho, int alto) throws HeadlessException {
        super(title);
        this.setSize(ancho, alto);
        this.gD = gD;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciaComponentes();
        this.setVisible(true);
    }
    public void iniciaComponentes()
    {
        this.escritorio = new JDesktopPane();
        this.barramenu = new JMenuBar();
        
       this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Resgistra Rector"));
        this.menuItemList.add(new JMenuItem("Registra Estudiante"));
        this.menuItemList.add(new JMenuItem("Registra Instituto")); 
        this.menuItemList.add(new JMenuItem("Registra Carrera")); 
        this.menuItemList.add(new JMenuItem ("Regista Inscripcion"));
      
            
        this.menuList = new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Registro"));

      
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barramenu);
        
        //agrega los menu a la barra
        this.barramenu.add(this.menuList.get(0));

        
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(1));
        this.menuList.get(0).add(this.menuItemList.get(2));   
        this.menuList.get(0).add(this.menuItemList.get(3));
        this.menuList.get(0).add(this.menuItemList.get(4));
        
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(4).addActionListener(new EventoVentanaPrincipal(this));
       
        
        
    }
  
    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarramenu() {
        return barramenu;
    }

    public void setBarramenu(JMenuBar barramenu) {
        this.barramenu = barramenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public VentanaEstudiante getVentanaEstudiante() {
        return ventanaEstudiante;
    }

    public void setVentanaEstudiante(VentanaEstudiante ventanaEstudiante) {
        this.ventanaEstudiante = ventanaEstudiante;
    }

    public VentanaRector getVentanaRector() {
        return ventanaRector;
    }

    public void setVentanaRector(VentanaRector ventanaRector) {
        this.ventanaRector = ventanaRector;
    }

    public VentanaInscripcion getVentanaInscripcion() {
        return ventanaInscripcion;
    }

    public void setVentanaInscripcion(VentanaInscripcion ventanaInscripcion) {
        this.ventanaInscripcion = ventanaInscripcion;
    }

    public VentanaCarrera getVentanaCarrera() {
        return ventanaCarrera;
    }

    public void setVentanaCarrera(VentanaCarrera ventanaCarrera) {
        this.ventanaCarrera = ventanaCarrera;
    }

    public VentanaInstituto getVentanaInstito() {
        return ventanaInstito;
    }

    public void setVentanaInstito(VentanaInstituto ventanaInstito) {
        this.ventanaInstito = ventanaInstito;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    
  
    
    
    
    
    
}
