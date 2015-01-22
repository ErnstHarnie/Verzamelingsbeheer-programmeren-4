/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dal.VerzamelingsType;
import dal.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ernst
 */
public class TypeService {



    public static VerzamelingsType GetType(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
                    Query q = session.createQuery("from VerzamelingsType type where type.id=" + Id);
        return (VerzamelingsType) q.uniqueResult();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally {
            session.close();
        }

    }

    public static List<VerzamelingsType> GetAllTypes() {
        Session session
                = NewHibernateUtil.getSessionFactory().openSession();
        try {
        Query q = session.createQuery("from VerzamelingsType");
        return q.list();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally {
            session.close();
        }
    }

}
