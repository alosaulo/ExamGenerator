/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Acervo;
import Model.Prova;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author CTC
 */
public class StartDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateTables();
    }
    
    public static void CreateTables(){
        Session actualSession = HibernateUtil.getSessionFactory().openSession();
        
        Acervo acervo = new Acervo();
        acervo.setID(new Random().nextLong());
        acervo.setProvasGeradas(null);
        
        actualSession.beginTransaction();
        
        actualSession.save(acervo);
        
        actualSession.getTransaction().commit();
        
        actualSession.close();

    }
    
}
