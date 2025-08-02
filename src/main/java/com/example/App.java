package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // User user = new User();
        // user.setFirstName("Mary");
        // user.setLastName("Doe");
        // user.setEmail("mary.doe@example.com");

        SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(com.example.User.class).buildSessionFactory();

        Session session = sFactory.openSession();
        User user = session.find(User.class, 1);
        user.setEmail("john.doe@example.com");
        session.beginTransaction();
        session.merge(user);
        session.getTransaction().commit();
        session.close();
        sFactory.close();
    }
}
