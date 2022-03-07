package org.uv.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.uv.app.HibernateUtil;
import org.uv.model.Departamentos;
import org.uv.model.Empleados;

/**
 *
 * @author citla
 */
public class daoEmpleado implements Idao<Empleados>{
    private SessionFactory sessionFactory;
    private Session session;

    public daoEmpleado() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public boolean insert(Empleados t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Empleados t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.delete(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Empleados t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Empleados readOne(Empleados t) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Empleados emp = (Empleados) session.get(Empleados.class, t.getClave());
        
        session.getTransaction().commit();
        session.close();
        return emp;
    }

    @Override
    public List<Empleados> readAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from empleados"); 
        
        List list=query.list();
        
        session.close();
        return list;
    }
    
}
