/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.vista;

import g01_g06_pap_ejercicio_02_04.modelo.Carrera;
import g01_g06_pap_ejercicio_02_04.modelo.Estudiante;
import g01_g06_pap_ejercicio_02_04.modelo.Inscripcion;
import g04_pap_ejercicio_02_04.controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo
 */
public class VentanaInscripcion extends JInternalFrame
{
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JComboBox combo;
    private JComboBox combo2;
    private JButton boton;
    private JPanel panelPrincipal;
    private GestionDato gD; 
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
   public VentanaInscripcion(GestionDato gD) {
        super("Registrar Inscripcion",true,true,true,true);
        this.gD=gD;
        this.iniciaComponente();
        this.setSize(500, 500);
    }
      public void iniciaComponente(){
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Codigo"));
        this.etiList.add(new JLabel("Estudiante"));
        this.etiList.add(new JLabel("Carrera"));
        
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.combo= new JComboBox(this.cargarCombo());
        this.combo2= new JComboBox(this.cargarCombo2());
        this.boton = new JButton("Guardar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(4,2);
        JPanel panelSup = new JPanel(disenioSup);
        panelSup.add(this.etiList.get(0));
        panelSup.add(this.txtList.get(0));
       
        
        panelSup.add(this.etiList.get(1));
        panelSup.add(this.combo);
        panelSup.add(this.etiList.get(2));
        panelSup.add(this.combo2);
        
        
        panelSup.add(this.boton);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        
        this.encabezado = new Object[3];
        this.encabezado[0] = "Codigo";
        this.encabezado[1] = "Estudiante";
        this.encabezado[2] = "Carrera";
        
        this.datos = this.cargaDatosTabla(this.gD.getInscripList().size(), 3);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(tabla);
        this.panelPrincipal.add(this.scroll,BorderLayout.CENTER);
        
     //   this.boton.addActionListener(new EventoVentanaInscripcion(this));
        
        this.add(this.panelPrincipal);
        
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Inscripcion c:this.gD.getInscripList())
        {
            
                retorno[i][0]=c.getId();
                retorno[i][1]=c.getEstudiante();
                retorno[i][2]=c.getCarrera();

            i++;
            
        }        
        return retorno;
    }
    
    public String[] cargarCombo(){
        String[] retorno = new String[this.gD.getEstudianteList().size()];
        int i=0;
        for(Estudiante c:this.gD.getEstudianteList()){
            retorno[i]=c.getNombre();
            i++;
        }
        return retorno;
    }
     public String[] cargarCombo2(){
        String[] retorno = new String[this.gD.getCarreraList().size()];
        int i=0;
        for(Carrera d:this.gD.getCarreraList()){
            retorno[i]=d.getNombre();
            i++;
        }
        return retorno;
    }
}
