package org.uv.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.uv.app.HibernateUtil;
import org.uv.model.Departamentos;

/**
 *
 * @author citla
 */
public class daoDepartamento implements Idao <Departamentos>{
    private SessionFactory sessionFactory;
    private Session session;
    
    public daoDepartamento() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean insert(Departamentos t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Departamentos t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.delete(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Departamentos t) {
        session= sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Departamentos readOne(Departamentos t) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Departamentos emp = (Departamentos) session.get(Departamentos.class, t.getClave());
        
        session.getTransaction().commit();
        session.close();
        return emp;
    }

    @Override
    public List<Departamentos> readAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        //corregir la parte del query no funciona
        Query query = session.createQuery("from departamentos");
        
        List list=query.list();
        
        session.close();
        return list;
    }
}
