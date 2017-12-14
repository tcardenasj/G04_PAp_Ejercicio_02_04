/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.vista;

import g01_g06_pap_ejercicio_02_04.modelo.Rector;
import g04_pap_ejercicio_02_04.controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
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
public class VentanaRector extends JInternalFrame
{
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private JPanel panelPrincipal;
    private GestionDato gD;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
     public VentanaRector(GestionDato gD) {
        super("Registrar Rector",true,true,true,true);
        this.gD=gD;
        this.iniciaComponentes();
        this.setSize(900, 500);
    }
      public void iniciaComponentes()
    {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Nombre"));
        this.etiList.add(new JLabel("Apellido"));
        this.etiList.add(new JLabel("Fecha De Nacimiento"));
        this.etiList.add(new JLabel("Cedula"));
        this.etiList.add(new JLabel("Codigo"));
        this.etiList.add(new JLabel("Titulo"));
 
        
        this.txtList= new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.boton = new JButton("Guardar");
        
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(7,2);
        JPanel panelSup = new JPanel(disenioSup);
        
        for(int i=0;i<6;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        
        panelSup.add(this.boton);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        
        this.encabezado = new Object[6];
        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "Apellido";
        this.encabezado[2] = "Fecha de nacimiento";
        this.encabezado[3] = "Cedula";
        this.encabezado[4] = "Codigo";
        this.encabezado[5] = "titulo";
        

        
        
        this.datos = this.cargaDatosTabla(this.gD.getRectorList().size(),4);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(tabla);
        
        this.panelPrincipal.add(this.scroll,BorderLayout.CENTER);
        
        
      //  this.boton.addActionListener(new EventoVentanaAutor(this));
        
        this.add(this.panelPrincipal);
        
     }
     public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Rector d:this.gD.getRectorList())
        {

                retorno[i][0]=d.getNombre();
                retorno[i][1]=d.getApellido();
                retorno[i][2]=d.getFechaNac();
                retorno[i][3]=d.getCedula();
                retorno[i][4]= d.getId();
                retorno[i][5]= d.getTitulo();
                i++;
            }
            
            
        return retorno;
    }
}
