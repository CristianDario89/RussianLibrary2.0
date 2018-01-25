/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Silvia
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Silvia
 */
public class usuarioOperaciones {

    //cargar usuarios, traer los reg d la tabla 
    public ArrayList<Persona2> getUsuarios() {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction(); //cada vez q realizas una interaccion tienes q hcer una transaccion
        //aka empieza la magic
        ArrayList<Persona2> arreglo = new ArrayList<Persona2>(); //pa poder cargar los datos dentro d este arraylist
        Query q = session.createQuery("from Persona2");
        List<Persona2> lista = q.list(); //pa q lo guarde lo del query en una lista
        Iterator<Persona2> iter = lista.iterator(); //pa manejar los datos d la lista
//aka termina magic
        tx.commit(); // pa q se ejec la trans
        session.close();
        //aka ya terminamos, tomamos la lista y la pasamos a un arraylist
        while (iter.hasNext()) {
            Persona2 noti = (Persona2) iter.next();
            arreglo.add(noti);
        }
        return arreglo;
    }

    public Persona2 getUsuarioPorID(int usuario) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        //se crea una instancia, te retorna/Crea un obj de la clase/entidad Persona2, usa session.get pa cargar un registro asociado a algo indicando clase(persona2)donde va a ir a buscar y le pasa el parametro
        Persona2 per = (Persona2)session.get(Persona2.class, usuario);
        tx.commit();
        session.close();
        return per;
    }

    public void updateUsuario(Persona2 usr) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        //se crea una instancia, te retorna/Crea un obj de la clase/entidad Persona2, usa session.get pa cargar un registro asociado a algo indicando clase(persona2)donde va a ir a buscar y le pasa el parametro
       // Persona2 per = (Persona2)session.get(Persona2.class, usuario);
        //per.setCorreo("daleeee@river.com");
        session.update(usr);
        tx.commit();
        session.close();
    }

    public void deleteUsuario(int usuario) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        //se crea una instancia, te retorna/Crea un obj de la clase/entidad Persona2, usa session.get pa cargar un registro asociado a algo indicando clase(persona2)donde va a ir a buscar y le pasa el parametro
        Persona2 per = (Persona2)session.get(Persona2.class, usuario);
        session.delete(per);
        tx.commit();
        session.close();
    }

    public void addUsuario(Persona2 user) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(user);
        tx.commit();
        session.close();
    }

}
