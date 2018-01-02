/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g04_pap_ejercicio_02_04.controlador;

/**
 *
 * @author paulo
 */

import g01_g06_pap_ejercicio_02_04.modelo.Carrera;
import g01_g06_pap_ejercicio_02_04.modelo.Estudiante;
import g01_g06_pap_ejercicio_02_04.modelo.Inscripcion;
import g01_g06_pap_ejercicio_02_04.modelo.Instituto;
import g01_g06_pap_ejercicio_02_04.modelo.Rector;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GestionDato
{
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia02_04");
    
    public boolean persistirCarrera(Carrera c)
    {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
    
    public boolean persistirEstudiante(Estudiante e)
    {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
    
    public boolean persistirInscripcion(Inscripcion i)
    {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(i);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
    
    public boolean persistirInstituto(Instituto in)
    {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(in);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
    
    public boolean persistirRector(Rector r)
    {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
    
    public List<Carrera> leerCarrera() {
        List<Carrera> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT c FROM Carrera c ORDER BY c.id").getResultList();        
        em.close();
        return retorno;
    }
    
    public List<Estudiante> leerEstudiante() {
        List<Estudiante> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Estudiante e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
    
    public List<Inscripcion> leerInscripcion() {
        List<Inscripcion> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT i FROM Inscripcion i ORDER BY i.id").getResultList();        
        em.close();
        return retorno;
    }
    
    public List<Instituto> leerInstituto() {
        List<Instituto> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT in FROM Instituto in ORDER BY in.id").getResultList();        
        em.close();
        return retorno;
    }
    
    public List<Rector> leerRector() {
        List<Rector> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT r FROM Rector r ORDER BY r.id").getResultList();        
        em.close();
        return retorno;
    }
    
    public Instituto buscarInstituto(String nombre) {
        Instituto retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Instituto.class, nombre);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    public Rector buscarRector(String nombre) {
        Rector retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Rector.class, nombre);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    public Estudiante buscarEstudiante(String nombre) {
        Estudiante retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Estudiante.class, nombre);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    public Carrera buscarCarrera(String nombre) {
        Carrera retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Carrera.class, nombre);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
}
