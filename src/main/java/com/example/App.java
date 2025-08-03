package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(com.example.User.class).buildSessionFactory();
        Session session = sFactory.openSession();
        System.out.println( "Hello World!" );
        User obj = context.getBean("user", User.class);
        obj.setFirstName("Mary");
        obj.setLastName("Doe");
        obj.setEmail("mary.doe1@example.com");
        session.beginTransaction();
        session.persist(obj);
        session.getTransaction().commit();

        

        User user = session.find(User.class, 1);
        user.setEmail("john.doe1@example.com");
        session.beginTransaction();
        session.merge(user);
        session.getTransaction().commit();
        session.close();
        sFactory.close();
    }
}
