/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.vista;

import g01_g06_pap_ejercicio_02_04.modelo.Instituto;
import g01_g06_pap_ejercicio_02_04.modelo.Rector;
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
public class VentanaInstituto extends JInternalFrame
{
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JComboBox combo;
    private JButton boton;
    private JPanel panelPrincipal;
    private GestionDato gD; 
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
    public VentanaInstituto(GestionDato gD) {
        super("Registrar Instituto",true,true,true,true);
        this.gD=gD;
        this.iniciaComponente();
        this.setSize(300, 300);
    }
      
    public void iniciaComponente(){
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Nombre"));
        this.etiList.add(new JLabel("Direccion"));
        this.etiList.add(new JLabel("Rector"));
        this.etiList.add(new JLabel("Telefono"));
        this.etiList.add(new JLabel("Ciudad"));
        
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.combo= new JComboBox(this.cargarCombo());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.boton = new JButton("Guardar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(6,2);
        JPanel panelSup = new JPanel(disenioSup);
        panelSup.add(this.etiList.get(0));
        panelSup.add(this.txtList.get(0));
        panelSup.add(this.etiList.get(1));
        panelSup.add(this.txtList.get(1));
        
        
        panelSup.add(this.etiList.get(2));
        panelSup.add(this.combo);
        panelSup.add(this.etiList.get(3));
        panelSup.add(this.txtList.get(3));
        panelSup.add(this.etiList.get(4));
        panelSup.add(this.txtList.get(4));
        
        
        
        
        panelSup.add(this.boton);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        
        this.encabezado = new Object[5];
        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "Direccion";
        this.encabezado[2] = "Rector";
        this.encabezado[3] = "Telefono";
        this.encabezado[4] = "Ciudad";
        
        this.datos = this.cargaDatosTabla((this.gD.getInstiList()).size(), 5);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(tabla);
        this.panelPrincipal.add(this.scroll,BorderLayout.CENTER);
        
       // this.boton.addActionListener(new EventoVentanaArticulo(this));
        
        this.add(this.panelPrincipal);
        
    }
     public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Instituto l:this.gD.getInstiList())
        {
            
                retorno[i][0]=l.getNombre();
                retorno[i][1]=l.getDireccion();
                retorno[i][2]=l.getRector();
                retorno[i][3]=l.getTelefono();
                retorno[i][4]=l.getCiudad();
                

            i++;
            
        }        
        return retorno;
    }
    
    public String[] cargarCombo(){
        String[] retorno = new String[this.gD.getRectorList().size()];
        int i=0;
        for(Rector u:this.gD.getRectorList()){
            retorno[i]=u.getNombre();
            i++;
        }
        return retorno;
    }
}
