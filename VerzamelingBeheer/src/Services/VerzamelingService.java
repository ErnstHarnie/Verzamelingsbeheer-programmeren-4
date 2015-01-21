/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.Categorie;
import BLL.Verzameling;
import DAL.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author Ernst
 */
public class VerzamelingService {

    public static Verzameling VerzamelingOpslaan(Verzameling verzameling) {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(verzameling);
            session.getTransaction().commit();
            session.close();
            return verzameling;
        } catch (Exception ex) {
            return null;
        }
    }

    public static boolean VerzamelingVerwijderen(int Id) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            Query q = session.createQuery("from Verzameling verzameling where verzameling.id=" + Id);
            Verzameling verzameling = (Verzameling) q.uniqueResult();
            session.beginTransaction();
            session.delete(verzameling);
            session.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            return false;
        } finally {
            session.close();
        }

    }
    


    public static Verzameling GetVerzameling(int Id) {
        Session session
                = NewHibernateUtil.getSessionFactory().openSession();
        try {
        
        Query q = session.createQuery("from Verzameling verzameling where verzameling.id=" + Id);
        return (Verzameling) q.uniqueResult();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally
        {
            session.close();
        }
    }
    
        public static Verzameling GetVerzameling(String naam) {
        Session session
                = NewHibernateUtil.getSessionFactory().openSession();
        try {
        
        Query q = session.createQuery("from Verzameling verzameling where verzameling.naam=" + naam);
        return (Verzameling) q.uniqueResult();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally
        {
            session.close();
        }
    }

    public static List<Verzameling> GetAllVerzamelingen() {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
       
        Query q = session.createQuery("from Verzameling");
        return q.list();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally
        {
            session.close();
        }
    }

}
