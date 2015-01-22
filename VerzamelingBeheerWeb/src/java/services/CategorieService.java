/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dal.Categorie;
import dal.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ernst
 */
public class CategorieService {


    public static Categorie GetCategorie(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            Query q = session.createQuery("from Categorie categorie where categorie.id = " + Id);
            return (Categorie) q.uniqueResult();
        } catch (Exception ex) {
            return null;
        } finally {
            session.close();
        }

    }

    public static List<Categorie> GetAllCategories() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            Query q = session.createQuery("from Categorie");
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
