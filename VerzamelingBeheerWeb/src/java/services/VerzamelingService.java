/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dal.VerzamelingsType;
import dal.Verzameling;
import dal.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author Ernst
 */
public class VerzamelingService {
 
    
        public static Verzameling GetVerzameling(int Id)
    {
        Session session = 
              NewHibernateUtil.getSessionFactory().openSession();
        try {
                     Query q = session.createQuery("from Verzameling verzameling where verzameling.id="+Id);
         return (Verzameling)q.uniqueResult();
        }
        catch (Exception ex)
        {
            return null;
        }
        finally {
            session.close();
        }

    }
        
        
        public static String ConvertJaNee(boolean isInBezit)
        {

            if (Boolean.toString(isInBezit).matches("true"))
            {
                return "Ja";
            }
            else
            {
                return "Neen";
            }
            
        }


        public static List<Verzameling> GetAllVerzamelingen()
        {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            try {
                            Query q = session.createQuery("from Verzameling v order by v.inBezit asc");
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
